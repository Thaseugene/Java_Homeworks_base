package by.itacademy.hw15.task2;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

public class Task implements Callable<String> {

    private final List<Integer> list = new CopyOnWriteArrayList<>();

    @Override
    public String call() throws Exception {
        int sum = 0;
        StringBuffer buffer = new StringBuffer();
        for (int i = 1; i <= 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        for (Integer number : list) {
            sum += number;
            buffer.append(number).append(" + ");
            list.remove(number);
        }
        buffer.replace(buffer.length() - 2, buffer.length(), "").append("= ").append(sum);
        Thread.sleep((int) (Math.random() * 10000));
        return Thread.currentThread().getName() + " : " + buffer;
    }
}
