package by.itacademy.hw16.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

        System.out.println("\nElements that remain: ");
        long count = myList.stream()
                .filter(s -> s.matches("\\w[^3]"))
                .sorted(Comparator.comparingInt(s -> Integer.parseInt(s.substring(1))))
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .sorted()
                .skip(1)
                .sorted(Comparator.reverseOrder())
                .peek(s -> System.out.print(s.toUpperCase() + " \n"))
                .count();

        System.out.printf("\nNumber of remaining elements: %s\n", count);

    }
}
