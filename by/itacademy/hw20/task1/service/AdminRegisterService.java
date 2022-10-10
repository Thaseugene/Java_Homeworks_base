package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.entity.Administrator;
import by.itacademy.hw20.task1.repositories.UserRepository;

public class AdminRegisterService {

    private static final String REGEX_LOGIN = "^\\w{5,20}$";
    private static final String REGEX_PASSWORD = "^\\w{8,}$";

    public void addNewAdmin(UserRepository repository, String login, String password) {
        repository.getUsers().put(login, new Administrator(login, password));
    }

    public boolean checkLogin(String login, UserRepository userRepository) {
        return login.matches(REGEX_LOGIN) && !userRepository.getUsers().containsKey(login);
    }

    public boolean checkPassword(String password) {
        return password.matches(REGEX_PASSWORD);
    }
}

