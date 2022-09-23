package by.itacademy.hw16.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Collection<Integer> col = new ArrayList<Integer>(List.of(3, 7, -1, 5, 7, 1));

        System.out.println("\nMin number:");
        col.stream()
                .min(Comparator.comparingInt(Integer::intValue))
                .ifPresent(System.out::println);

        System.out.println("\nMax number:");
        col.stream()
                .max(Comparator.comparingInt(Integer::intValue))
                .ifPresent(System.out::println);

        System.out.println("\nAverage of the all numbers in the list:");
        col.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .ifPresent(System.out::println);

        System.out.println("\nResult of multiplication:");
        System.out.println(col.stream()
                .mapToInt(Integer::intValue)
                .reduce(1, (a, b) -> a * b));

        System.out.println("\nSum of the all numbers in the list:");
        System.out.println(col.stream()
                .mapToInt(Integer::intValue)
                .sum());

        System.out.println("\nSum of abs values of the all numbers in the list:");
        System.out.println(col.stream()
                .mapToInt(Math::abs)
                .sum());


    }
}
