package by.itacademy.hw4;

import java.util.Arrays;
public class Task6 {
    public static void sorter (int... numbers) {
        int counterPlus = 0;
        int counterMinus = 0;
        for (int number : numbers) {
            if (number >= 0) {
                counterPlus++;
            } else {
                counterMinus++;
            }
        }
        int[] arrPlus = new int[counterPlus];
        int[] arrMinus = new int[counterMinus];
        int i = 0;
        int j = 0;
        for (int number : numbers) {
            if (number >= 0) {
                arrPlus[j++] = number;
            } else {
                arrMinus[i++] = number;
            }
        }
        System.out.println("Array with positive numbers - " + Arrays.toString(arrPlus));
        System.out.println("Array with negative numbers - " + Arrays.toString(arrMinus));
    }

    public static void main(String[] args) {

        sorter(7, 1, -7, 9, 5, -3, -10, -12, -27, -3, 11);

    }
}
