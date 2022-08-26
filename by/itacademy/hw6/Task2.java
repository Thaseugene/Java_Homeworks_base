package by.itacademy.hw6;

import java.util.regex.Pattern;

public class Task2 {

    public static void find(String[] string) {

        int digits = string[0].length();
        for (int i = 1; i < string.length; i++) {
            if (string[i].length() > digits) {
                digits = string[i].length();
            }
        }
             System.out.println("Next substring(s) has(have) the largest number of digits: " + digits);
            for (String s : string) {
                if (s.length() == digits) {
                    System.out.println(s);
                }
            }
        }

    public static void main(String[] args) {

        String text = " 2 sdfsdg w4r3r4r4333 43fef4 34343 fefsg4 34343 dsdgsd19423sdfs sfs s    sfdsef ererg90909  ";

        Pattern splitPattern = Pattern.compile("\\D+");
        String[] someString = splitPattern.split(text);

        if (someString.length == 0) {
            System.out.println("No numbers");
        } else {
            find(someString);
        }
        }
    }



