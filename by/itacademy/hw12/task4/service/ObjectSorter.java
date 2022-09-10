package by.itacademy.hw12.task4.service;

import by.itacademy.hw12.task4.entity.Person;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ObjectSorter {

    public Map<String, Person> sortByName(List<Object> list) {
        Map<String, Person> map = new TreeMap<>();
        for (Object el : list) {
            if (el instanceof Person) {
                map.put(((Person) el).getName(), (Person) el);
            }
        }
        return map;
    }

    public Map<String, Person> sortBySurname(List<Object> list) {
        Map<String, Person> map = new TreeMap<>();
        for (Object el : list) {
            if (el instanceof Person) {
                map.put(((Person) el).getSurname(), (Person) el);
            }
        }
        return map;
    }
}
