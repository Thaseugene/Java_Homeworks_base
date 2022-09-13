package by.itacademy.hw13.task2;

public class TaskFindMax implements Runnable {

    private final String[] array;
    private int max;

    public TaskFindMax(String[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        synchronized (array) {
            max = Integer.parseInt(array[0]);
            try {
                for (int i = 1; i < array.length; i++) {
                    if (Integer.parseInt(array[i]) > max) {
                        max = Integer.parseInt(array[i]);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Max value - " + max);
    }

}
