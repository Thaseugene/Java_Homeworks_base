package by.itacademy.hw12.task4.service;

import by.itacademy.hw12.task4.entity.Person;

import java.util.Map;

public class Printer {

    public void printMap(Map<String, Person> map) {
        int counter = 1;
        for (Map.Entry<String, Person> person : map.entrySet()) {
            System.out.printf("\n%d. %s %s age: %d", counter, person.getValue().getName(),
                    person.getValue().getSurname(), person.getValue().getAge());
            counter++;
        }
        System.out.println();
    }

}
