package by.itacademy.hw12.task3.service;

import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriter {

    public void writeBytesToFile(byte[] bytes, String filename) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename)) {
            fileOutputStream.write(bytes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
