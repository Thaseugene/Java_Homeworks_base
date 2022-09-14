package by.itacademy.hw13.task2;

public class TaskFindMin implements Runnable {

    private final String[] array;

    public TaskFindMin(String[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        synchronized (array) {
            int min = Integer.parseInt(array[0]);
            for (int i = 1; i < array.length; i++) {
                if (Integer.parseInt(array[i]) < min) {
                    min = Integer.parseInt(array[i]);
                }
            }
            System.out.println("Min value - " + min);
        }
    }
}
