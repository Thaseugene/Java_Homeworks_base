package by.itacademy.hw13.task3;

public class TaskForCount implements Runnable{

    private final MyNumber number;

    public TaskForCount(MyNumber number) {
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number) {
                System.out.println();
                for (int i = 1; i <= 100; i++) {
                    System.out.print(number.getNumber());
                }
            number.addToNumber();
        }
    }
}
