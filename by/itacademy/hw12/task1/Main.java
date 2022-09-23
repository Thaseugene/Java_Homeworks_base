package by.itacademy.hw12.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Writing files with random
        createFileWithRandom("in1.txt");
        createFileWithRandom("in2.txt");

        List<Integer> readList = new ArrayList<>();


        //Reading files with random and writing data to list
        readToList("in1.txt", readList);
        readToList("in2.txt", readList);

        //Sorting data
        Collections.sort(readList);

        //Writing to file out
        writeListToOutput(readList, "out.txt");

        System.out.println("Program done.");

    }


    public static void createFileWithRandom(String fileName) {
        try (Writer writer = new FileWriter(fileName)) {
            for (int i = 1; i <= 1000; i++) {
                writer.write((int) (Math.random() * 100000 + 1) + " ");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void readToList(String fileName, List<Integer> readList) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String[] elements = reader.readLine().split(" ");
            for (String numbers : elements) {
                readList.add(Integer.valueOf(numbers));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeListToOutput(List<Integer> readList, String fileName) {
        try (Writer writer = new FileWriter(fileName)) {
            for (Integer number : readList) {
                writer.write(number + " ");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
