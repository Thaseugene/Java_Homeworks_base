package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.exceptions.UserNotExistException;
import by.itacademy.hw20.task1.exceptions.WrongPasswordException;
import by.itacademy.hw20.task1.repositories.UserRepository;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;

public class AuthenticationService {
    private static AuthenticationService instance;

    private final UserRepository userRepository;

    private AuthenticationService() {
        this.userRepository = UserRepository.getInstance();
    }

    public static AuthenticationService getInstance() {
        if(instance == null) {
            instance = new AuthenticationService();
        }
        return instance;
    }

    public boolean checkLogin(String login) {
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

    public boolean checkPassword(String password, String login) {
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
