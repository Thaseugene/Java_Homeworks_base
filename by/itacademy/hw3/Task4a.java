package by.itacademy.hw3;

import java.util.Arrays;

public class Task4a {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;
        int c = 1;

        int[] array = new int[] {a, b, c};
        Arrays.sort(array);
        System.out.print("Numbers from min to max: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        }
    }

