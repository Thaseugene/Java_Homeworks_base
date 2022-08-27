package by.itacademy.hw7.task2;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.print("Please enter value of degrees in Celsius: ");

        CelsiusDegree celsiusDegree = new CelsiusDegree(new Scanner(System.in).nextDouble());

        KelvinDegree kelvinDegree = new KelvinDegree(celsiusDegree.getValue());
        FahrenheitDegree fahrenheitDegree = new FahrenheitDegree(celsiusDegree.getValue());
        System.out.printf("Values of degrees after conversion: \n%.2f Kelvin", kelvinDegree.Convertion());
        System.out.printf("\n%.2f Fahrenheit", fahrenheitDegree.Convertion());
    }
}
