package by.itacademy.hw7.Task2;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter value of degrees in Celsius: ");
        double value = scanner.nextDouble();

        CelsiusDegree celsiusDegree = new CelsiusDegree(value);

        KelvinDegree kelvinDegree = new KelvinDegree(celsiusDegree.getValue());
        FahrenheitDegree fahrenheitDegree = new FahrenheitDegree(celsiusDegree.getValue());
        System.out.println("Values of degrees after conversion: ");
        System.out.println(String.format("%.2f",kelvinDegree.Convertion()) + " Kelvin");
        System.out.println(String.format("%.2f",fahrenheitDegree.Convertion()) + " Fahrenheit");
    }
}
