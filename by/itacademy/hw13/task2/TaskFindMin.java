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
            for (String s : array) {
                if (Integer.parseInt(s) < min) {
                    setMin(Integer.parseInt(s));
                }
            }
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
