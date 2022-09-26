package by.itacademy.hw14.task1;

import java.time.LocalDateTime;

public class MyThread extends Thread {

    private final int period;


    public MyThread(int period) {
        this.period = period;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(LocalDateTime.now());
                Thread.sleep(period * 1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
