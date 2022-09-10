package by.itacademy.hw12.task2.service;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {



    public void writeFile(String text, String fileName) {
        try (java.io.Writer writer = new FileWriter(fileName)) {
            writer.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
