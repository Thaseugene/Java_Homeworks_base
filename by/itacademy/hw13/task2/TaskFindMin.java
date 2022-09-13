package by.itacademy.hw13.task2;

public class TaskFindMin implements Runnable {

    private final String[] array;
    private int min;

    public TaskFindMin(String[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        synchronized (array) {
            min = Integer.parseInt(array[0]);
            try {
                for (int i = 1; i < array.length; i++) {
                    if (Integer.parseInt(array[i]) < min) {
                        min = Integer.parseInt(array[i]);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Min value - " + min);
    }

}
