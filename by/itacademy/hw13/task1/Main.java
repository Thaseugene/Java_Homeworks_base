package by.itacademy.hw13.task1;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

// ==============================Please, wait for end program================================

        Object objectOne = new Object();
        Object objectTwo = new Object();

        TaskOne taskOne = new TaskOne(objectOne, objectTwo);
        TaskTwo taskTwo = new TaskTwo(objectOne, objectTwo);

        Thread threadOne = new Thread(taskOne);

        System.out.println(threadOne.getState());

        threadOne.start();

        Thread.sleep(1000);

        System.out.println(threadOne.getState());

        Thread threadTwo = new Thread(taskTwo);
        threadTwo.start();

        Thread.sleep(3000);

        System.out.println(threadOne.getState());
        System.out.println(threadTwo.getState());

        TimeUnit.SECONDS.sleep(7);

        threadTwo.interrupt();

        System.out.println(threadTwo.getState());

    }

}
