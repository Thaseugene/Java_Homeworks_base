package by.itacademy.hw4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter integer number: ");

        long num = scanner.nextLong();
        long facto=1;
        if (num >= 0) {
            for (long i=1; i<=num; i++) {
                facto = facto * i;
            }
            if (facto <= 0) {
                System.out.println(("Factorial of number = Infinity"));
            } else {
                System.out.println(("Factorial of number = " + facto));
            }
        } else {
            System.out.println("Incorrect number");
        }
    }
}
