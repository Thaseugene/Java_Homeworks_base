package by.itacademy.hw9.task1;

public class Task1 {
    public static void main(String[] args) {

        System.out.printf("\nResult of summation - %.2f\n",sum(2, 9.95));

        System.out.printf("\nResult of multiplication - %.2f\n",multiply(2, 9.95));

        System.out.printf("\nResult of dividing - %.2f\n",divide(2, 9.95));

        System.out.printf("\nResult of subtraction - %.2f\n",subtraction(2, 9.95));

    }

    public static <T extends Number, V extends Number> double sum (T a, V b) {
        return a.doubleValue()+b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply (T a, V b) {
        return a.doubleValue()*b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide (T a, V b) {
        return a.doubleValue()/b.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction (T a, V b) {
        return a.doubleValue()-b.doubleValue();
    }

}
