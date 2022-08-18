package by.itacademy.hw4;

import java.sql.Array;
import java.util.Arrays;

public class Task10 {

    public static int theLargest(int [] array) {
        int index = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void findMax (int[][] array) {
        int[] max = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                max[i] = max[i] + array[i][j];
                }
            }
        //System.out.println(Arrays.toString(max));
        System.out.println("The row with max summ of elements - " + Arrays.toString(array[theLargest(max)]));
        }

    public static void main(String[] args) {
        int[][] arr = new int [8][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j< arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*100);
            }
        }
        System.out.println("Initial array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
        findMax(arr);


    }
}
