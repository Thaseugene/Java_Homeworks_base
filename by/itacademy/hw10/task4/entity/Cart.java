package by.itacademy.hw10.task4.entity;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {

    private final Map<String, Pet> map;

    public Cart() {
        map = new LinkedHashMap<>();
    }

    public Map<String, Pet> getMap() {
        return map;
    }
}
