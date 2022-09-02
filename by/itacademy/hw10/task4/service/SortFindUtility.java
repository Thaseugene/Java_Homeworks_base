package by.itacademy.hw10.task4.service;

import by.itacademy.hw10.task4.entity.Pet;

import java.util.*;

public class SortFindUtility {

    public static Map<String, Pet> sortByKey(Map<String, Pet> map) {
        return new TreeMap<>(map);
    }

    public static Map<String, Pet> sortByValue(Map<String, Pet> map) {
        LinkedHashMap<String, Pet> sorted = new LinkedHashMap<>();
        ArrayList<Pet> list = new ArrayList<>();
        for (Map.Entry<String, Pet> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        list.sort(new Comparator<Pet>() {
            public int compare(Pet o1, Pet o2) {
                return (o1.getPrice().compareTo(o2.getPrice()));
            }
        });
        for (Pet pet : list) {
            for (Map.Entry<String, Pet> entry : map.entrySet()) {
                if (entry.getValue().getPrice().equals(pet.getPrice())) {
                    sorted.put(entry.getKey(), pet);
                }
            }
        }
        return sorted;
    }

    public static Map<String, Pet> findByValue(Map<String, Pet> map, double value1, double value2) {
        Map<String, Pet> findList = new LinkedHashMap<>();
        for (Map.Entry<String, Pet> entry : map.entrySet()) {
            if (entry.getValue().getPrice() >= value1 && entry.getValue().getPrice()<= value2) {
                findList.put(entry.getKey(), entry.getValue());
            }
        }
        return findList;
    }

}
