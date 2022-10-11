package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.console.exceptions.UserNotExistException;
import by.itacademy.hw20.task1.console.exceptions.WrongPasswordException;
import by.itacademy.hw20.task1.repositories.UserRepository;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

public class AuthenticationService {

    public static boolean checkLogin(UserRepository userRepository, String login) {
        boolean check = false;
        try {
            if (!userRepository.getUsers().containsKey(login)) {
                throw new UserNotExistException(StandardPhrases.INC_LOG.getText());
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
                throw new WrongPasswordException(StandardPhrases.INC_PAS.getText());
            } else {
                check = true;
            }
        } catch (WrongPasswordException ex) {
            System.out.println(ex.getMessage());
        }
        return check;
    }

}
