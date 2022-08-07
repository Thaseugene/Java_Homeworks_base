package by.itacademy.hw4;

public class Task5 {

    public static void theLowest(int[] array) {
        int index = 0;
        int min = array[1];
        for (int i = 3; i < array.length; i = i+2) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("The lowest number of array is = " + min + " with odd index " + index);
    }

    public static void main(String[] args) {
        int[] newArray = new int[]{7, 1, -7, 9, 5, -3, -10, -12, -27, -3, 11};

        theLowest(newArray);
    }
}
