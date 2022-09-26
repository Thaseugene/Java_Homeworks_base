package by.itacademy.hw15.task2;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

public class Task implements Callable<String> {

    private final List<Integer> list = new CopyOnWriteArrayList<>();

    @Override
    public String call() throws Exception {
        int sum = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        for (Integer number : list) {
            sum += number;
            builder.append(number).append(" + ");
            list.remove(number);
        }
        builder.replace(builder.length() - 2, builder.length(), "").append("= ").append(sum);
        Thread.sleep((int) (Math.random() * 10000));
        return Thread.currentThread().getName() + " : " + builder;
    }
}
