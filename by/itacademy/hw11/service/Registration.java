package by.itacademy.hw11.service;

import by.itacademy.hw11.service.exceptrions.WrongLoginException;
import by.itacademy.hw11.service.exceptrions.WrongPasswordException;
import by.itacademy.hw11.entity.UserRepository;

import java.util.Scanner;

public class Registration {

    public static final String REGEX_LOGIN = "^\\w{5,20}$";
    public static final String REGEX_PASSWORD = "^\\w{8,}$";

    public static void register(UserRepository userRepository) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please create new login. Login should contain only Latin letters, numbers and " +
                "underscore. The length should be from 5 to 20 characters.");
        try {
            String login = scanner.nextLine();
            if (!login.matches(REGEX_LOGIN)) {
                throw new WrongLoginException("Login is out of conditions, please try to create login again");
            } else {
                System.out.println("Please create your password. Password must contain only Latin letters, numbers " +
                        "and underscore character. Length should be longer than 8 characters");
                try {
                    String password = scanner.nextLine();
                    if (!password.matches(REGEX_PASSWORD)) {
                        throw new WrongPasswordException("Your password is out off conditions, please try to create " +
                                "login and password again");
                    } else {
                        userRepository.getRepository().put(login, password);
                        System.out.println("Your account has been successfully created");
                    }
                } catch (WrongPasswordException ex) {
                    System.out.printf("%s. Error: %s\n",ex.getMessage(), WrongPasswordException.class.getSimpleName());
                }
            }
        } catch (WrongLoginException ex) {
            System.out.printf("%s. Error: %s\n",ex.getMessage(), WrongLoginException.class.getSimpleName());
        }
    }
}
