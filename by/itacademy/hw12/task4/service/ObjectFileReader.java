package by.itacademy.hw12.task4.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectFileReader {

    public List<Object> readToList(String fileName) {
        List<Object> list = new ArrayList<>();
        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            list = new ArrayList<>((List<?>) objectInputStream.readObject());
        }
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

}
