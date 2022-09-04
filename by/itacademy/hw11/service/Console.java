package by.itacademy.hw11.service;

import by.itacademy.hw11.entity.UserRepository;

import java.util.Scanner;

public class Console {

    public static void startConsole(UserRepository userRepository) {
        int selection = 0;
        do {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            selection = scanner.nextInt();
            switch (selection) {
                case 1: {
                    Signing.signIn(userRepository);
                    break;
                }
                case 2: {
                    Registration.register(userRepository);
                    break;
                }
                case 3: break;
                default:
                    System.out.println("\nThe selection was invalid!");
            }
        } while (selection != 3);
    }

    private static void printMenu() {
        System.out.println("\nEnter number to choose menu:");
        System.out.println("[1] Sign in");
        System.out.println("[2] Create new account");
        System.out.println("[3] Quit");
        System.out.print("Insert selection: ");
    }
}
