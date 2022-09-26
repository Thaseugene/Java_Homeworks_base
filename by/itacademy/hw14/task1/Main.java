package by.itacademy.hw14.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter period of time in seconds: ");
        int periodOfTime = scanner.nextInt();

        MyThread thread = new MyThread(periodOfTime);
        thread.setDaemon(true);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
