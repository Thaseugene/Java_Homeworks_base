package by.itacademy.hw17;

import by.itacademy.hw17.entity.UserRepository;
import by.itacademy.hw17.service.Console;
import by.itacademy.hw17.service.Registration;
import by.itacademy.hw17.service.Signing;


public class Main {
    public static void main(String[] args) {

        Console.startConsole(UserRepository.getInstance(), new Registration(), new Signing());

    }
}
