package by.itacademy.hw17.service;

import by.itacademy.hw17.entity.UserRepository;
import by.itacademy.hw17.service.exceptrions.UserNotExistException;
import by.itacademy.hw17.service.exceptrions.WrongLoginException;
import by.itacademy.hw17.service.exceptrions.WrongPasswordException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ConsoleCommandsExecutor {

    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public void tryToSignIn(Signing signing, UserRepository userRepository) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your login:");
        try {
            String login = scanner.nextLine();
            if (!signing.checkLogin(userRepository, login)) {
                throw new UserNotExistException("Incorrect login, please try to login again");
            } else {
                System.out.println("Please enter your password");
                try {
                    String password = scanner.nextLine();
                    if (!signing.checkPassword(userRepository, password, login)) {
                        throw new WrongPasswordException("Incorrect password, please try to login again");
                    } else {
                        System.out.println("You have been signed in");
                        userRepository.getUsers().get(login).setLastAuthorizationDate();
                    }
                } catch (WrongPasswordException ex) {
                    System.out.printf("%s. Error: %s\n", ex.getMessage(),
                            WrongPasswordException.class.getSimpleName());
                }
            }
        } catch (UserNotExistException ex) {
            System.out.printf("%s. Error: %s\n", ex.getMessage(),
                    UserNotExistException.class.getSimpleName());
        }
    }

    public void tryToRegister(Registration registration, UserRepository userRepository) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please create new login. Login should contain only Latin letters, numbers " +
                "and underscore. The length should be from 5 to 20 characters.");
        try {
            String login = scanner.nextLine();
            if (!registration.checkLogin(login, userRepository)) {
                throw new WrongLoginException("Login is out of conditions or this login has been " +
                        "already used. Please try to create login again");
            } else {
                System.out.println("Please create your password. Password must contain only Latin " +
                        "letters, numbers and underscore character. Length should be longer than " +
                        "8 characters");
                try {
                    String password = scanner.nextLine();
                    if (!registration.checkPassword(password)) {
                        throw new WrongPasswordException("Your password is out off conditions, please " +
                                "try to create login and password again");
                    } else {
                        registration.register(userRepository, login, password);
                        System.out.println("Your account has been successfully created");
                    }
                } catch (WrongPasswordException ex) {
                    System.out.printf("%s. Error: %s\n", ex.getMessage(),
                            WrongPasswordException.class.getSimpleName());
                }
            }
        } catch (WrongLoginException ex) {
            System.out.printf("%s. Error: %s\n", ex.getMessage(),
                    WrongLoginException.class.getSimpleName());
        }
    }

    public void tryToFindLastSignInDate(Signing signing, UserRepository userRepository) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login to find last enter date");
        try {
            String login = scanner.nextLine();
            if (!signing.checkLogin(userRepository, login)) {
                throw new UserNotExistException("Incorrect login, please try again");
            } else {
                System.out.println(userRepository.getUsers().get(login).getLastAuthorizationDate().format(FORMATTER));
            }
        } catch (UserNotExistException e) {
            System.out.println(e.getMessage());
        }
    }

    public void tryToFindRegistrationDates(UserRepository userRepository) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To find all registered accounts by date, please enter start date in format " +
                "(yyyy-MM-dd HH:mm). For example - 1986-04-08 12:30");
        try {
            LocalDateTime dateStart = LocalDateTime.parse(scanner.nextLine(), FORMATTER);
            System.out.println("Enter end date in format (yyyy-MM-dd HH:mm).");
            LocalDateTime dateEnd = LocalDateTime.parse(scanner.nextLine(), FORMATTER);
            userRepository.getUsers().entrySet().stream()
                    .filter(s -> s.getValue().getRegistrationDate().isAfter(dateStart) &&
                            s.getValue().getRegistrationDate().isBefore(dateEnd))
                    .forEach(s -> System.out.println(s.getValue().getLogin() + " "
                            + s.getValue().getRegistrationDate().format(FORMATTER)));

        } catch (DateTimeParseException e) {
            System.out.println("Incorrect date format, please try again");
        }
    }
}
