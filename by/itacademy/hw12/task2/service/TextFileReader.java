package by.itacademy.hw12.task2.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {

    public String readFileToString(String fileName) {
        String text = new String();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            text = reader.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return text;
    }

}
