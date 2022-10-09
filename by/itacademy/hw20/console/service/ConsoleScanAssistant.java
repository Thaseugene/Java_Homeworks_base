package by.itacademy.hw20.console.service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ConsoleScanAssistant {

    public static int scanInt() {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Incorrect number");
        }
        return number;
    }

    public static String scanString() {
        String text = new String();
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        return text;
    }

    public static int printAndScanInt(String text) {
        PrintToConsole.print(text);
        return ConsoleScanAssistant.scanInt();
    }
    public static int printAndScanInt(String text, List<?> list) {
        PrintToConsole.print(text);
        ListPrinter.printList(list);
        return ConsoleScanAssistant.scanInt();
    }
    public static String printAndScanLine(String text) {
        PrintToConsole.print(text);
        return ConsoleScanAssistant.scanString();
    }
    public static String printAndScanLine(String text, List<?> list) {
        PrintToConsole.print(text);
        ListPrinter.printList(list);
        return ConsoleScanAssistant.scanString();
    }

}
