package by.itacademy.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter integer number: ");

        int num = scanner.nextInt();

        if (num < 0 || num > 59) {
            System.out.println("Error! Number is out of range");
        } else if (num <=15) {
            System.out.println("1-st quarter of an hour");
        } else if (num <= 30 && num > 15) {
            System.out.println("2-st quarter of an hour");
        } else if (num <= 45 && num > 30) {
            System.out.println("3-rd quarter of an hour");
        } else {
            System.out.println("4-th quarter of an hour");
        }
    }
}
