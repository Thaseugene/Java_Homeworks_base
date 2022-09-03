package by.itacademy.hw10.task4.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetShop {

    private final Map<String, Pet> map;

    public PetShop() {
        map = new HashMap<>();
    }

    public void addPet(List<Pet> pets) {
        for (Pet pet : pets) {
            map.put(pet.getName(), pet);
        }
    }

    public Map<String, Pet> getMap() {
        return map;
    }
}
