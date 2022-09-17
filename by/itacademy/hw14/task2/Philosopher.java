package by.itacademy.hw14.task2;

public class Philosopher implements Runnable {

    private final Fork forkOne;
    private final Fork forkTwo;
    private boolean haveEaten;

    public Philosopher(Fork forkOne, Fork forkTwo) {
        this.forkOne = forkOne;
        this.forkTwo = forkTwo;
        haveEaten = false;
    }

    @Override
    public void run() {
        while (!haveEaten) {
            tryToEat();
            tryToThink();
        }
    }

    public void tryToEat() {
        try {
            Thread.sleep((int) (Math.random() * 1000) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        forkOne.pickUp();
        forkTwo.pickUp();
        try {
            System.out.printf("%s is eating spaghetti\n", Thread.currentThread().getName());
            Thread.sleep((int) (Math.random() * 1000) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        haveEaten = true;
        try {
            System.out.printf("%s has finished eating\n", Thread.currentThread().getName());
            Thread.sleep((int) (Math.random() * 1000) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void tryToThink() {
        forkOne.putDown();
        forkTwo.putDown();
        try {
            System.out.printf("%s is thinking and drinking vine\n", Thread.currentThread().getName());
            Thread.sleep((int) (Math.random() * 1000) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public boolean isHaveEaten() {
        return haveEaten;
    }

}




