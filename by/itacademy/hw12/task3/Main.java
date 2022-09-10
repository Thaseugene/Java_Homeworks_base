package by.itacademy.hw12.task3;


import by.itacademy.hw12.task3.service.BinaryFileReader;
import by.itacademy.hw12.task3.service.BinaryFileWriter;
import by.itacademy.hw12.task3.service.Printer;

public class Main {

    public static void main(String[] args) {
        BinaryFileReader fileReader = new BinaryFileReader();
        BinaryFileWriter fileWriter = new BinaryFileWriter();
        Printer printer = new Printer();
        String fileName = "binary.bin";

        fileWriter.writeBytesToFile(createNumbers(), fileName);

        printer.printNumbers(fileReader.readFileToByte(fileName));

        printer.printMiddleValue(fileReader.readFileToByte(fileName));

    }

    public static byte[] createNumbers() {
        byte[] bytes = new byte[30];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = ((byte) (Math.random() * 100 + 1));
        }
        return bytes;
    }


}
