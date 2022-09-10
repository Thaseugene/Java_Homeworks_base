package by.itacademy.hw10.task4.entity;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private final Map<String, Pet> map;

    public Cart() {
        map = new HashMap<>();
    }

    public Map<String, Pet> getMap() {
        return map;
    }
}
