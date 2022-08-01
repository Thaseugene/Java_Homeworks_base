package by.itacademy.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //scanner for import from console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter integer number of seconds: ");

        //Period of time that must be converted
        int sec = scanner.nextInt();

        //Main calculations
        int weeks = sec / (7*24*3600);
        int days = (sec % (7*24*3600)) / (24*3600);
        int hours = ((sec % (7*24*3600)) % (24*3600)) / 3600;
        int minutes = (((sec % (7*24*3600)) % (24*3600)) % 3600) / 60;
        int seconds = (((sec % (7*24*3600)) % (24*3600)) % 3600) % 60;

        //Output in console
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
