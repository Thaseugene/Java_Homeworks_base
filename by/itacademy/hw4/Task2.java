package by.itacademy.hw4;

import java.util.Scanner;

public class Task2 {

    public static int sum(int number) {
        int sum = 0;
        if ( number < 0) {  //It is condition for situation when the first member of number < 0
            String s = Integer.toString(number);
            String[] parts = s.split("");
            for (int i = 2; i < parts.length; i++) {
                sum = sum + Integer.parseInt(parts[i]);
            }
            sum = sum - Integer.parseInt(parts[1]);
        } else if (number > 0) {
            String s = Integer.toString(number);
            String[] parts = s.split("");
            for (int i = 0; i < parts.length; i++) {
                sum = sum + Integer.parseInt(parts[i]);
            }
        } else {
            sum = 0;
        }
        return sum;
    }

    public static int multi(int number) {
        int multi = 1;
        if ( number < 0) {  //It is condition for situation when the first member of number < 0
            String s = Integer.toString(number);
            String[] parts = s.split("");
            for (int i = 2; i < parts.length; i++) {
                multi = multi * Integer.parseInt(parts[i]);
            }
            multi = multi * (-Integer.parseInt(parts[1]));
        } else if (number > 0) {
            String s = Integer.toString(number);
            String[] parts = s.split("");
            for (int i = 0; i < parts.length; i++) {
                multi = multi * Integer.parseInt(parts[i]);
            }
        } else {
            multi = 0;
        }
        return multi;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter integer number: ");

        int num = scanner.nextInt();

        System.out.println("The summation result is - " + sum(num));
        System.out.println("The multiplication result is - " + multi(num));
    }
}
