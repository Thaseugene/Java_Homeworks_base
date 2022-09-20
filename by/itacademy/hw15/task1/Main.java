package by.itacademy.hw15.task1;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore(1);

        Store store = new Store();
        Producer producer = new Producer(sem, store);
        Consumer consumer = new Consumer(sem, store);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();

    }
}
