package by.itacademy.hw11;

import by.itacademy.hw11.entity.UserRepository;
import by.itacademy.hw11.service.Console;
import by.itacademy.hw11.service.Registration;
import by.itacademy.hw11.service.Signing;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = UserRepository.getInstance();
        Registration registration = new Registration();
        Signing signing = new Signing();
        Console.startConsole(userRepository, registration, signing);


    }
}
