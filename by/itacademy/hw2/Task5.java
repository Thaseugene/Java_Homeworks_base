package by.itacademy.hw2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        //Input form console
        System.out.print("Enter an integer number: ");
        int num = reader.nextInt();

       //Checking for even or odd
       String answer = (num % 2 == 0) ? num + " is even" : num + " is odd";

       //Output
       System.out.println(answer);

    }
}
