package by.itacademy.hw10.task4.service;

import by.itacademy.hw10.task4.entity.Pet;

import java.util.Map;

public class Printing {

    public static void printList(Map<String, Pet> map) {
        int counter = 1;
        for (Map.Entry<String, Pet> pet : map.entrySet()) {
            System.out.printf("\n%d. %s %s with price %.2f usd", counter, pet.getValue().getClass().getSimpleName(),
                    pet.getKey(), pet.getValue().getPrice());
            counter++;
        }
        System.out.println("\n");
    }
}
