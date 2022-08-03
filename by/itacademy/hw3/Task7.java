package by.itacademy.hw3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter second number: ");
        int num2 = scanner.nextInt();
         if ((num1*num2) < 0) {
             System.out.println("Please enter numbers both are more than 0 or both are less than 0");

         } else {

             System.out.print("Please enter the result of multiplication this numbers: ");
             int multi = scanner.nextInt();

             String answer = (multi == num1*num2) ? "Your answer is correct" : "Mistake! " + num1*num2 + " is correct answer";

             System.out.println(answer);
         }

    }

}
