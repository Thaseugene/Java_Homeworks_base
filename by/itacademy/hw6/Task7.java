package by.itacademy.hw6;

public class Task7 {

    public static void main(String[] args) {

        //Task case 1
        Double doubleOne = Double.valueOf(1.0);
        Double doubleTwo = Double.valueOf(2.0);
        Double doubleThree = Double.valueOf(3.0);

        //Task case 2
        Double doubleFour = Double.parseDouble("4");

        //Task case 3
        System.out.println("Wrapper Double to primitive byte: " + doubleOne +" -> "+ doubleOne.byteValue());
        System.out.println("Wrapper Double to primitive short: " + doubleTwo +" -> "+ doubleTwo.shortValue());
        System.out.println("Wrapper Double to primitive int: " + doubleThree +" -> "+ doubleThree.intValue());
        System.out.println("Wrapper Double to primitive long: " + doubleFour +" -> "+ doubleFour.longValue());
        System.out.println("Wrapper Double to primitive long: " + doubleOne +" -> "+ doubleOne.doubleValue());

        //Task case 4
        System.out.println("doubleOne = " + doubleOne);
        System.out.println("doubleTwo = " + doubleTwo);
        System.out.println("doubleThree = " + doubleThree);
        System.out.println("doubleFour = " + doubleFour);

        //Task case 5
        String d = Double.toString(Double.valueOf(3.14));

    }
}
