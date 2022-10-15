package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.exceptions.WrongLoginException;
import by.itacademy.hw20.task1.exceptions.WrongPasswordException;
import by.itacademy.hw20.task1.entity.Administrator;
import by.itacademy.hw20.task1.repositories.UserRepository;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;

public class RegistrationService {

    private static RegistrationService instance;
    private final UserRepository userRepository;
    private static final String REGEX_LOGIN = "^\\w{5,20}$";
    private static final String REGEX_PASSWORD = "^\\w{8,}$";

    public RegistrationService() {
        this.userRepository = UserRepository.getInstance();
    }

    public static RegistrationService getInstance() {
        if(instance == null) {
            instance = new RegistrationService();
        }
        return instance;
    }

    public void register(String login, String password) {
        userRepository.getUsers().put(login, new Administrator(login, password));
    }

    public boolean checkLogin(String login) {
        boolean check = false;
        try {
            if (!login.matches(REGEX_LOGIN) && !userRepository.getUsers().containsKey(login)) {
                throw new WrongLoginException(StandardPhrases.LOG_OUT_COND.getText());
            } else {
                check = true;
            }
        } catch (WrongLoginException ex) {
            System.out.println(ex.getMessage());
        }
        return check;
    }

    public boolean checkPassword(String password) {
        boolean check = false;
        try {
            if (!password.matches(REGEX_PASSWORD)) {
                throw new WrongPasswordException(StandardPhrases.PAS_OUT_COND.getText());
            } else {
                check = true;
            }
        } catch (WrongPasswordException ex) {
            System.out.println(ex.getMessage());
        }
        return check;

    }
}
