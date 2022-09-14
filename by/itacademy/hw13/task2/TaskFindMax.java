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
            for (String s : array) {
                if (Integer.parseInt(s) > max) {
                    setMax(Integer.parseInt(s));
                }
            }
        }
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
