package by.itacademy.hw17.service;

import by.itacademy.hw17.entity.UserRepository;

public class Signing {

    public boolean checkLogin(UserRepository userRepository, String login) {
        return userRepository.getUsers().containsKey(login);
    }

    public boolean checkPassword(UserRepository userRepository, String password, String login) {
        return password.equals(userRepository.getUsers().get(login).getPassword());
    }
}
