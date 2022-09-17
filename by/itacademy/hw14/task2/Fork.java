package by.itacademy.hw14.task2;

public class Fork {

    private final int number;

    private boolean hasTaken;


    public Fork(int number) {
        this.number = number;
        hasTaken = false;
    }

    public int getNumber() {
        return number;
    }

    public synchronized void pickUp() {
        while (hasTaken) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%s has picked up fork %d\n", Thread.currentThread().getName(), number);
        hasTaken = true;
    }

    public synchronized void putDown() {
        System.out.printf("%s has put down fork %d\n", Thread.currentThread().getName(), number);
        hasTaken = false;
        notify();
    }
}
