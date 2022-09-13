package by.itacademy.hw13.task1;

public class TaskOne implements Runnable {

    private final Object objectOne;
    private final Object objectTwo;

    public TaskOne(Object objectOne, Object objectTwo) {
        this.objectOne = objectOne;
        this.objectTwo = objectTwo;
    }

    public Object getObjectOne() {
        return objectOne;
    }

    public Object getObjectTwo() {
        return objectTwo;
    }

    @Override
    public void run() {
        synchronized (objectOne) {
            try {
                System.out.println(Thread.currentThread().getState());
                objectOne.wait();
                Thread.sleep(2000);
                synchronized (objectTwo) {
                    int i = 10;
                }
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
