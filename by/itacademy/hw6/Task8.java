package by.itacademy.hw6;

public class Task8 {

    public static void main(String[] args) {

        String regExpress = "^#?([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";

        String colorsCheck = "#000000";

        if (colorsCheck.matches(regExpress)) {
            System.out.println("Color code " + "\"" + colorsCheck + "\"" + " is correct");
        } else {
            System.out.println("Color code " + "\"" + colorsCheck + "\"" + " is incorrect");
        }


    }
}
