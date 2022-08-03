package by.itacademy.hw3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int a = 4;
        int b = 10;
        int c = 1;

        if (a > b && b > c) {
            System.out.println("Numbers from min to max: " + a + " " + b + " " + c);
        } else if (a > c && c > b) {
            System.out.println("Numbers from min to max: " + b + " " + c + " " + a);
        } else if (b > a && a > c) {
            System.out.println("Numbers from min to max: " + c + " " + a + " " + b);
        } else if (b > c && c > a) {
            System.out.println("Numbers from min to max: " + a + " " + c + " " + b);
        } else if (c > b && b > a) {
            System.out.println("Numbers from min to max: " + a + " " + b + " " + c);
        } else {
            System.out.println("Numbers from min to max: " + b + " " + a + " " + c);
        }
    }
}
