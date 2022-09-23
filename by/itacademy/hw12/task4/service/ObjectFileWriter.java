package by.itacademy.hw12.task4.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class ObjectFileWriter {

    public void writeFile(List<?> list, String fileName) {
        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(list);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
