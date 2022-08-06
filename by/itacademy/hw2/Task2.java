package by.itacademy.hw2;

import java.util.Scanner;

public class Task2 {


    //Main calculation method
    public  static int sum(int a, int b) {
        return ((a+b+(a*b)));
    }

    public static void main(String[] args) {

        //scanner for import from console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first integer number: ");

        int num1 = scanner.nextInt();

        System.out.print("Please enter second integer number: ");

        int num2 = scanner.nextInt();

        System.out.println("The result of method = " + sum(num1,num2));

    }
}
