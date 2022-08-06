package by.itacademy.hw2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //scanner for import from console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");

        String num1 = scanner.nextLine();

        double a = Double.parseDouble(num1);

        System.out.print("Please enter second number: ");

        String num2 = scanner.nextLine();

        double b = Double.parseDouble(num2);

        System.out.print("Please enter third number: ");

        String num3 = scanner.nextLine();

        double c = Double.parseDouble(num3);

        if (Math.abs(a) < Math.abs(b) & Math.abs(a) < Math.abs(c)) {
            System.out.println("The least number by abs is " + num1);
        }
        else if (Math.abs(b) < Math.abs(a) & Math.abs(b) < Math.abs(c)) {
            System.out.println("The least number by abs is " + num2);
        }
        else {
            System.out.println("The least number by abs is " + num3);
        }
    }

}
