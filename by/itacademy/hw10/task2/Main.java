package by.itacademy.hw10.task2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please, enter text:");

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Map<String, Integer> map = new TreeMap<>();

        for (String word : text.split("\\s+") )
            map.put(word, map.getOrDefault(word, 0) + 1);

        map.forEach((key, value) -> System.out.printf("\nWord %s has repeated - %d time(times)", key, value));
    }
}
