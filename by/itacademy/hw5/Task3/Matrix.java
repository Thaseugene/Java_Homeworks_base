package by.itacademy.hw5.Task3;

import java.util.Arrays;

public class Matrix {

    int iLen;
    int jLen;

    int[][] arr;


    //----------------------constructor------------------------------------
    Matrix(int iLen, int jLen) {
        this.iLen = iLen;
        this.jLen = jLen;
        arr = new int[iLen][jLen];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*100);
            }
        }
    }

    //-------------------------getters methods-------------------------------
    private int getIlen() {

        return iLen;
    }

    private int getJlen() {

        return jLen;
    }

    private int getElementValue(int i, int j) {

        return arr[i][j];
    }


    //-----------------------------main methods------------------------------

    //print method
    void print() {
        System.out.println("Created matrix: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

        //summation method
    public static void sum(Matrix matrix1, Matrix matrix2) {
        int[][] matrix3 = new int[matrix1.getIlen()][matrix1.getJlen()];

        if (matrix1.getIlen() == matrix2.getIlen() && matrix1.getJlen() == matrix2.getJlen()) {
            for (int i = 0; i < matrix3.length; i++) {
                for (int j = 0; j < matrix3[i].length; j++) {
                    matrix3[i][j] = matrix1.getElementValue(i,j) + matrix2.getElementValue(i,j);
                }
            }
        } else {
            System.out.println("Incorrect dimensions of matrices");
        }
        System.out.println("Result of summation: ");
        for (int i = 0; i < matrix3.length; i++) {
            System.out.println(Arrays.toString(matrix3[i]));
        }
    }

    //multiplication method
    public static void multiplication(Matrix matrix1, Matrix matrix2) {
        int[][] matrix3 = new int[matrix1.getIlen()][matrix2.getJlen()];

        if (matrix1.getIlen() == matrix2.getJlen() || matrix1.getJlen() == matrix2.getIlen()) {
            for (int i = 0; i < matrix3.length; i++) {
                for (int j = 0; j < matrix3[i].length; j++) {
                    for (int r = 0; r < matrix1.getJlen(); r++) {
                        matrix3[i][j] = matrix3[i][j] + matrix1.getElementValue(i, r) * matrix2.getElementValue(r, j);
                    }
                }
            }
        } else {
            System.out.println("Incorrect dimensions of matrices");
        }
        System.out.println("Result of multiplication: ");
        for (int i = 0; i < matrix3.length; i++) {
            System.out.println(Arrays.toString(matrix3[i]));
        }
    }

    //multiply by number method
    public static void multiplyByNumber(Matrix matrix1, int a) {
        int[][] matrix3 = new int[matrix1.getIlen()][matrix1.getJlen()];

            for (int i = 0; i < matrix3.length; i++) {
                for (int j = 0; j < matrix3[i].length; j++) {
                    matrix3[i][j] = matrix1.getElementValue(i,j) * a;
                }
            }
        System.out.println("Result of multiplication matrix by number " + a + ":");
        for (int i = 0; i < matrix3.length; i++) {
            System.out.println(Arrays.toString(matrix3[i]));
        }
    }
}
