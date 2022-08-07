package by.itacademy.hw4;

import java.util.Arrays;

public class Task7 {


    public static void main(String[] args) {

        int len = 20;
        int[] arr = new int[len];
        int[] arrMirror = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println("Start array : " + Arrays.toString(arr));

        for (int i = arr.length - 1; i >= 0; i--) {
            arrMirror[arr.length - 1 - i] = arr [i];
        }
        System.out.println("Array after rotating : " + Arrays.toString(arrMirror));

    }

}
