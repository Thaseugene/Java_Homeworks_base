package by.itacademy.hw16.task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("Something happening now! It is terrible");
        col.add("Could you send me my login?");
        col.add("Yes. I could.");
        col.add("Bye");

        System.out.println("\nString that collects word \"login\":");
        col.stream()
                .filter(s -> s.contains("login"))
                .forEach(System.out::println);

        System.out.println("\nThe longest string:");
        col.stream()
                .max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);

        System.out.println("\nThe shortest string:");
        col.stream()
                .min(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);

        System.out.println("\nString-words:");
        col.stream()
                .filter(s -> s.trim().matches("\\b[a-zA-z]+\\b"))
                .forEach(System.out::println);

        System.out.println("\nAll words:");
        col
                .forEach(s -> Arrays.stream((s.split("\\s*(\\s|\\p{Punct}|\\.)\\s*")))
                        .forEach(i -> System.out.print(i + " ")));

    }

}
