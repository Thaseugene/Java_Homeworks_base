package by.itacademy.hw17.service;

import by.itacademy.hw17.entity.UserRepository;
import java.util.Scanner;

public class Console {


    public static void startConsole(UserRepository userRepository, Registration registration, Signing signing) {
        int selection = 0;
        do {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            selection = scanner.nextInt();
            switch (selection) {

                case 1: {
                    new ConsoleCommandsExecutor().tryToSignIn(signing, userRepository);
                    break;
                }

                case 2: {
                    new ConsoleCommandsExecutor().tryToRegister(registration, userRepository);
                    break;
                }

                case 3: {
                    new ConsoleCommandsExecutor().tryToFindLastSignInDate(signing, userRepository);
                    break;
                }

                case 4: {
                    new ConsoleCommandsExecutor().tryToFindRegistrationDates(userRepository);
                    break;
                }

                case 5:
                    break;

                default:
                    System.out.println("\nThe selection was invalid!");
            }
        } while (selection != 5);
    }

    private static void printMenu() {
        System.out.println("\nEnter number to choose menu:");
        System.out.println("[1] Sign in");
        System.out.println("[2] Create new account");
        System.out.println("[3] Show last sign in");
        System.out.println("[4] Find by registration date");
        System.out.println("[5] Quit");
        System.out.print("Insert selection: ");
    }
}
