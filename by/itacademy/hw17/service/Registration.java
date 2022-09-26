package by.itacademy.hw17.service;

import by.itacademy.hw17.entity.User;
import by.itacademy.hw17.entity.UserRepository;

public class Registration {

    private static final String REGEX_LOGIN = "^\\w{5,20}$";
    private static final String REGEX_PASSWORD = "^\\w{8,}$";

    public void register(UserRepository userRepository, String login, String password) {
        userRepository.getUsers().put(login, new User(login, password));
    }

    public boolean checkLogin(String login, UserRepository userRepository) {
        return login.matches(REGEX_LOGIN) && !userRepository.getUsers().containsKey(login);
    }

    public boolean checkPassword(String password) {
        return password.matches(REGEX_PASSWORD);
    }
}
