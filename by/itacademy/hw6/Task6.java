package by.itacademy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String input = "Versions: Java  5, Java 6, Java 7, Java 8, Java 12.";

        Pattern pattern = Pattern.compile("Java\\s+\\d{1,2}");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
