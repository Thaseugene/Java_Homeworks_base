package by.itacademy.hw3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter length of first side: ");
        int a = scanner.nextInt();

        System.out.print("Please enter length of second side: ");
        int b = scanner.nextInt();

        System.out.print("Please enter length of third side: ");
        int c = scanner.nextInt();

        if (a > (b+c) || b > (a+c) || c > (a+b)) {
            System.out.println("Triangle couldn't be created");
        } else {
            System.out.println("Triangle can be created");
        }
    }
}
