package by.itacademy.hw6;

public class Task9 {

    public static void main(String[] args) {

        String regExpress = "^(?=.+)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@(\\w*).((\\.[a-z]{2,6})|(\\.[a-z]{2,6}." +
                "\\.[a-z]{2,6}))$";

        String mailCheck = "a.pe_-.trov@gmail.com.au";

        if (mailCheck.matches(regExpress)) {
            System.out.println("Email - " + "\"" + mailCheck + "\"" + " is correct");
        } else {
            System.out.println("Email - " + "\"" + mailCheck + "\"" + " is incorrect");
        }

    }
}
