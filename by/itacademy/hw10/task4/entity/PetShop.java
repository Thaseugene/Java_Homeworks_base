package by.itacademy.hw10.task4.entity;

import java.util.LinkedHashMap;
import java.util.Map;

public class PetShop {

    private final Map<String, Pet> map;

    public PetShop() {
        map = new LinkedHashMap<>();
    }

    public void addPet(Pet... pets) {
        for (Pet pet : pets) {
            map.put(pet.getName(), pet);
        }
    }

    public Map<String, Pet> getMap() {
        return map;
    }
}
