package by.itacademy.hw15.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Task task = new Task();
        List<Future<String>> list = new ArrayList<Future<String>>();
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
            Future<String> future = service.submit(task);
            list.add(future);
        }
        for (Future<String> fut : list) {
            try {
                System.out.println(fut.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e.getMessage());
            }
        }
        service.shutdown();
    }
}

