package by.itacademy.hw13.task1;

public class TaskTwo implements Runnable {

    private final Object objectOne;
    private final Object objectTwo;

    public TaskTwo(Object objectOne, Object objectTwo) {
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
            objectOne.notify();
        }
        synchronized (objectTwo) {
            try {
                Thread.sleep(6000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
