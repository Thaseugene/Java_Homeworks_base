package by.itacademy.hw10.task4.service;

import by.itacademy.hw10.task4.entity.Pet;

import java.util.Map;

public class CostCalculator {

    public static double calculate(Map<String, Pet> map) {
        double value = 0.0;
        for (Map.Entry<String, Pet> pet : map.entrySet()) {
            value += pet.getValue().getPrice();
        }
        return value;
    }
}

