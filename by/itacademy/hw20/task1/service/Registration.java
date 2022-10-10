package by.itacademy.hw20.task1.service;

import by.itacademy.hw17.service.exceptrions.WrongPasswordException;
import by.itacademy.hw20.task1.console.exceptions.WrongLoginException;
import by.itacademy.hw20.task1.entity.Administrator;
import by.itacademy.hw20.task1.repositories.UserRepository;

public class Registration {

    private static final String REGEX_LOGIN = "^\\w{5,20}$";
    private static final String REGEX_PASSWORD = "^\\w{8,}$";

    public static void register(UserRepository userRepository, String login, String password) {
        userRepository.getUsers().put(login, new Administrator(login, password));
    }

    public static boolean checkLogin(String login, UserRepository userRepository) {
        boolean check = false;
        try {
            if (!login.matches(REGEX_LOGIN) && !userRepository.getUsers().containsKey(login)) {
              throw new WrongLoginException("\"Login is out of conditions or this login has been " +
                      "already used. Please try to create login again\"");
            } else {
                check = true;
            }
        } catch (WrongLoginException ex) {
            System.out.println(ex.getMessage());
        }
        return check;
    }

    public static boolean checkPassword(String password) {
    boolean check = false;
        try {
        if (!password.matches(REGEX_PASSWORD)) {
            throw new WrongPasswordException("Your password is out off conditions, please " +
                    "try to create login and password again");
        } else {
            check = true;
        }
    } catch (WrongPasswordException ex) {
        System.out.println(ex.getMessage());
    }
        return check;

    }
}
