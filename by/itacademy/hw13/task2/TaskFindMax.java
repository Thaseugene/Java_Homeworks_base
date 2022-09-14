package by.itacademy.hw13.task2;

public class TaskFindMax implements Runnable {

    private final String[] array;

    public TaskFindMax(String[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int max;
        synchronized (array) {
            max = Integer.parseInt(array[0]);
            for (int i = 1; i < array.length; i++) {
                if (Integer.parseInt(array[i]) > max) {
                    max = Integer.parseInt(array[i]);
                }
            }
        }
        System.out.println("Max value - " + max);
    }
}
