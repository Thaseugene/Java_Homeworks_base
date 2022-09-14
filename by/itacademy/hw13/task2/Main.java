package by.itacademy.hw13.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        String[] numbers = getLinesFromConsole();
        if (containsAllIntegers(numbers)) {
            TaskFindMax taskFindMax = new TaskFindMax(numbers);
            TaskFindMin taskFindMin = new TaskFindMin(numbers);
            Thread threadForMax = new Thread(taskFindMax);
            Thread threadForMin = new Thread(taskFindMin);

            threadForMax.start();
            threadForMin.start();

            threadForMax.join();
            threadForMin.join();

            System.out.println("Max value - " + taskFindMax.getMax());
            System.out.println("Min value - " + taskFindMin.getMin());
        } else {
            System.out.println("Incorrect input");
        }

    }


    public static String[] getLinesFromConsole() {

        String strLine = "";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter array of integer numbers one by one with commas. For example - \"1, 3, 5\":");
            strLine = br.readLine();
            isr.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return strLine.replace(" ", "").trim().split(",");

    }

    public static boolean containsAllIntegers(String[] integers) {
        for (String integer : integers) {
            if (!isInteger(integer)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
