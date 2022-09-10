package by.itacademy.hw12.task3.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class BinaryFileReader {

    public byte[] readFileToByte(String fileName) {
        long fileSize = new File(fileName).length();
        byte[] allBytes = new byte[(int) fileSize];
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int lenght = fis.read(allBytes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return allBytes;
    }

}
