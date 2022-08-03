package by.itacademy.hw3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter integer number: ");

        int num = scanner.nextInt();

        if (num % 2 != 0 && num > 0) {
            System.out.println(num + " is odd and > 0");
        } else if (num % 2 == 0 && num < 0) {
            System.out.println(num + " is even and < 0");
        }
        else {
            System.out.println("Number is out of conditions");
        }
    }
}
