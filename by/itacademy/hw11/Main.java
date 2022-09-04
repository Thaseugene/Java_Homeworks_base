package by.itacademy.hw11;

import by.itacademy.hw11.entity.UserRepository;
import by.itacademy.hw11.service.Console;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = UserRepository.getInstance();
        Console.startConsole(userRepository);


    }
}
