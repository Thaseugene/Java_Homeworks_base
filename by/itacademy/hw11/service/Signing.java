package by.itacademy.hw11.service;

import by.itacademy.hw11.service.exceptrions.UserNotExistException;
import by.itacademy.hw11.service.exceptrions.WrongPasswordException;
import by.itacademy.hw11.entity.UserRepository;

import java.util.Scanner;

public class Signing {

    public static void signIn(UserRepository userRepository) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your login");
        try {
            String login = scanner.nextLine();
            if (!userRepository.getRepository().containsKey(login)) {
                throw new UserNotExistException("Incorrect login, please try to login again");
            } else {
                System.out.println("Please enter your password");
                try {
                    String password = scanner.nextLine();
                    if (!password.equals(userRepository.getRepository().get(login))) {
                        throw new WrongPasswordException("Incorrect password, please try to login again");
                    } else {
                        System.out.println("You have been signed in");
                    }
                } catch (WrongPasswordException ex) {
                    System.out.printf("%s. Error: %s\n",ex.getMessage(), WrongPasswordException.class.getSimpleName());
                }
            }
        } catch (UserNotExistException ex) {
            System.out.printf("%s. Error: %s\n",ex.getMessage(), UserNotExistException.class.getSimpleName());
        }
    }
}
