package by.itacademy.hw6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task5 {


    public static String replace(String text, String stringChange, String stringToChange)
    {
        StringBuilder str = new StringBuilder();
        Pattern pattern = Pattern.compile(stringChange, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        int counter = 0;
        while (matcher.find())
        {
            if ((counter++)%2 != 0)
            {
                matcher.appendReplacement(str, stringToChange);
            }
        }
        matcher.appendTail(str);
        return str.toString();
    }

    public static void main(String[] args) {

        String input = "Object-oriented programming is a programming language model organized around objects rather than" +
                " \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented " +
                "programming bla bla bla object-oriented programming";

        System.out.println("Before replacement: ");
        System.out.println(input);

        System.out.println();

        System.out.println("After replacement: ");
        System.out.println(replace(input,"Object-oriented programming","OOP"));

    }


}
