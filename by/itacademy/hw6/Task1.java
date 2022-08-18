package by.itacademy.hw6;

public class Task1 {
    public static void main(String[] args) {
        String someString = "  a   lot    of   words and   spaces     in   this           string  ";

        someString = someString.trim().replaceAll("\\s+", " ");

        System.out.println(someString);
    }
}
