package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.console.exceptions.UserNotExistException;
import by.itacademy.hw20.task1.console.exceptions.WrongPasswordException;
import by.itacademy.hw20.task1.repositories.UserRepository;

public class Validator {

    public static boolean checkLogin(UserRepository userRepository, String login) {
        boolean check = false;
        try {
            if (!userRepository.getUsers().containsKey(login)) {
                throw new UserNotExistException("Incorrect login");
            } else {
                check = true;
            }
        } catch (UserNotExistException ex) {
            System.out.println(ex.getMessage());
        }
        return check;
    }

    public static boolean checkPassword(UserRepository userRepository, String password, String login) {
        boolean check = false;
        try {
            if (!password.equals(userRepository.getUsers().get(login).getPassword())) {
                throw new WrongPasswordException("Incorrect password");
            } else {
                check = true;
            }
        } catch (WrongPasswordException ex) {
            System.out.println(ex.getMessage());
        }
        return check;
    }

}
