package by.itacademy.hw12.task4;

import by.itacademy.hw12.task4.entity.Person;
import by.itacademy.hw12.task4.service.ObjectFileReader;
import by.itacademy.hw12.task4.service.ObjectFileWriter;
import by.itacademy.hw12.task4.service.Printer;
import by.itacademy.hw12.task4.service.ObjectSorter;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        ObjectFileWriter writer = new ObjectFileWriter();
        ObjectFileReader reader = new ObjectFileReader();
        ObjectSorter sorter = new ObjectSorter();
        Printer printer = new Printer();

        Person person1 = new Person("John", "Kjusak", 31);
        Person person2 = new Person("Julia", "Johnson", 45);
        Person person3 = new Person("Samanta", "Bradbok", 25);
        Person person4 = new Person("Kyle", "Simmons", 27);
        Person person5 = new Person("Albert", "Wilson", 35);

        List<?> list = new ArrayList<>(List.of(person1, person2, person3, person4, person5));

        //Write to file
        writer.writeFile(list,"Persons.txt");

        //Read and print sorted by name list of persons
        System.out.println("Sorted by name:");
        printer.printMap(sorter.sortByName(reader.readToList("Persons.txt")));

        //Read and print sorted by surname list of persons
        System.out.println("\nSorted by surname:");
        printer.printMap(sorter.sortBySurname(reader.readToList("Persons.txt")));


    }




}
