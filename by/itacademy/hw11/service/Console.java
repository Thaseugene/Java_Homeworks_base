package by.itacademy.hw11.service;

import by.itacademy.hw11.entity.UserRepository;
import by.itacademy.hw11.service.exceptrions.UserNotExistException;
import by.itacademy.hw11.service.exceptrions.WrongLoginException;
import by.itacademy.hw11.service.exceptrions.WrongPasswordException;

import java.util.Scanner;

public class Console {

    public static void startConsole(UserRepository userRepository, Registration registration, Signing signing) {
        int selection = 0;
        do {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            selection = scanner.nextInt();
            switch (selection) {

                case 1: {
                    Scanner firstScanner = new Scanner(System.in);
                    System.out.println("Please enter your login:");
                    try {
                        String login = firstScanner.nextLine();
                        if (!signing.checkLogin(userRepository, login)) {
                            throw new UserNotExistException("Incorrect login, please try to login again");
                        } else {
                            System.out.println("Please enter your password");
                            try {
                                String password = firstScanner.nextLine();
                                if (!signing.checkPassword(userRepository, password, login)) {
                                    throw new WrongPasswordException("Incorrect password, please try to login again");
                                } else {
                                    System.out.println("You have been signed in");
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
                    break;
                }


                case 2: {
                    Scanner secondScanner = new Scanner(System.in);
                    System.out.println("Please create new login. Login should contain only Latin letters, numbers " +
                            "and underscore. The length should be from 5 to 20 characters.");
                    try {
                        String login = secondScanner.nextLine();
                        if (!registration.checkLogin(login, userRepository)) {
                            throw new WrongLoginException("Login is out of conditions or this login has been " +
                                    "already used. Please try to create login again");
                        } else {
                            System.out.println("Please create your password. Password must contain only Latin " +
                                    "letters, numbers and underscore character. Length should be longer than " +
                                    "8 characters");
                            try {
                                String password = secondScanner.nextLine();
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
                    break;
                }


                case 3:
                    break;

                default:
                    System.out.println("\nThe selection was invalid!");
            }
        } while (selection != 3);
    }

    private static void printMenu() {
        System.out.println("\nEnter number to choose menu:");
        System.out.println("[1] Sign in");
        System.out.println("[2] Create new account");
        System.out.println("[3] Quit");
        System.out.print("Insert selection: ");
    }
}
