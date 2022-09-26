package by.itacademy.hw14.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Fork fork1 = new Fork(1);
        Fork fork2 = new Fork(2);
        Fork fork3 = new Fork(3);
        Fork fork4 = new Fork(4);
        Fork fork5 = new Fork(5);

        Thread thread1 = new Thread(new Philosopher(fork5, fork1), "Tanos");
        Thread thread2 = new Thread(new Philosopher(fork1, fork2), "Iron man");
        Thread thread3 = new Thread(new Philosopher(fork2, fork3), "Kratos");
        Thread thread4 = new Thread(new Philosopher(fork3, fork4), "Kant");
        Thread thread5 = new Thread(new Philosopher(fork4, fork5), "Platon");

        List<Thread> threadList = new ArrayList<Thread>(List.of(thread1, thread2, thread3, thread4, thread5));

        for (Thread thread : threadList) {
            thread.start();
        }
    }
}
