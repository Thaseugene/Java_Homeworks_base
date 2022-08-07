package by.itacademy.hw4;

public class Task4 {

    public static void theLargest(int [] array) {
        int index = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("The largest number of array is = " + max + " with index " + index);
    }

    public static void theLowest(int [] array) {
        int index = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("The lowest number of array is = " + min + " with index " + index);
    }

    public static void main(String[] args) {
        int[] newArray = new int[] {-9, 1, -7, 11, 5};
        theLargest(newArray);
        theLowest(newArray);
    }
}
