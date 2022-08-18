package by.itacademy.hw4;

import java.util.Arrays;

public class Task8 {

    public static void sorterBubble (int[] array) {
        for (int i=0;i< array.length-1;++i){
            for(int j=0;j< array.length-i-1; ++j){
                if(array[j+1]<array[j]){
                    int timeVariable = array[j];
                    array[j] = array[j+1];
                    array[j+1] = timeVariable;
                }
            }
        }
        System.out.println("Bubble sorting - " + Arrays.toString(array));
    }

    public static void sorterInsert (int[] array) {
        for (int i = 0; i < array.length; i++) {
            int timeVariable = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (timeVariable < array[j]) {
                    array[j+1] = array[i];
                } else {
                    break;
                }
                array[j+1] = timeVariable;
            }
        }
        System.out.println("Insert sorting - " + Arrays.toString(array));
    }

    public static void sorterSelection (int[] array) {

        for (int i = 0; i < array.length; i++) {
            int index = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = min;
        }
        System.out.println("Selection sorting - " + Arrays.toString(array));
    }

    public static void main(String[] args) {

        int len = 20;
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }

        System.out.println("Start array : " + Arrays.toString(arr));
        sorterBubble(arr);
        sorterInsert(arr);
        sorterSelection(arr);

    }
}
