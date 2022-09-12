package by.itacademy.hw11.service;

import by.itacademy.hw11.entity.UserRepository;

import java.util.Scanner;

public class Signing {

    public boolean checkLogin(UserRepository userRepository, String login) {
        return userRepository.getUsers().containsKey(login);
    }

    public boolean checkPassword(UserRepository userRepository, String password, String login) {
        return password.equals(userRepository.getUsers().get(login));
    }
}
