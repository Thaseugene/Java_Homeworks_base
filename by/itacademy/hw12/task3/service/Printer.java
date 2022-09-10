package by.itacademy.hw12.task3.service;

public class Printer {

    public void printNumbers(byte[] bytes) {
        System.out.println("\nNumber in file");
        for (byte value : bytes) {
            System.out.print(value + " ");
        }
    }

    public void printMiddleValue(byte[] bytes) {
        int sum = 0;
        for (byte value : bytes) {
            sum += value;
        }
        System.out.printf("\n\nMiddle value - %s",(double) sum/bytes.length);
    }
}
