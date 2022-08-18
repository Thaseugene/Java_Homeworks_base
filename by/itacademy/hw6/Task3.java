package by.itacademy.hw6;

import java.util.regex.Pattern;

public class Task3 {


    public static boolean checkString (String[] string) {
        boolean check = true;
        int counter = 0;
        if (string.length >= 2) {
            for (int i = 1; i < string.length; i++) {
                if (string[i - 1].length() == string[i].length()) {
                    counter++;
                }
            }
        }
        if (string.length == (counter + 1)) {
            check = false;
        } else {
            check = true;
        }
        return check;
    }

    public static String swapWords (String[] string) {

        String longest = "";
        String shortest = "";
        String regex = "^[a-zA-Z]+$";
        int digitsMax = string[0].length();
        int digitsMin = string[0].length();
        int indexOne = 0;
        int indexTwo = 0;
        StringBuilder str = new StringBuilder();

        for (int i = 1; i < string.length; i++) {
            if (string[i].length() > digitsMax && string[i].matches(regex)) {
                digitsMax = string[i].length();

            } else if (string[i].length() < digitsMin && string[i].matches(regex)) {
                digitsMin = string[i].length();

            }
        }

        for (int i = 0; i < string.length; i++) {
            if (string[i].length() == digitsMax && string[i].matches(regex)) {
                longest = string[i];
                indexOne = i;
                break; //for first longest
            }
        }

        for (int i = 0; i < string.length; i++) {
            if (string[i].length() == digitsMin && string[i].matches(regex)) {
                shortest = string[i];
                indexTwo = i;
            }
        }
        string[indexTwo] = longest;
        string[indexOne] = shortest;
        for (int i = 0; i < string.length; i++) {
            str.append(string[i]);
        }
        return str.toString();
    }


    public static void main(String[] args) {
        String someString = "Please, replace the first longest word with the last shortest one";

        String testString = someString.trim().replaceAll("\\s+", " ");
        Pattern splitPattern = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        String[] text = splitPattern.split(testString);

        Pattern splitPatternTwo = Pattern.compile("\\b*(\\b|,|!|\\.)\\b*");
        String[] textForSwap = splitPatternTwo.split(someString);

        if (checkString(text) == false) {
            System.out.println("Not enough words or words with equal length");
        }
        else {
            System.out.println("String before swap: " + "\"" + someString + "\"");
            System.out.println("String after swap: " + "\"" + swapWords(textForSwap) + "\"");
        }
    }
}

