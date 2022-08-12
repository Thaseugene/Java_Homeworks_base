package by.itacademy.hw5;

public class Task3 {

    public static void main(String[] args) {


        //-------------------------creating two matrices----------------------
        Matrix first = new Matrix(3,3);
        first.print();

        System.out.println();

        Matrix second = new Matrix(3,3);
        second.print();

        System.out.println();

        //---------------------showing methods---------------------------

        //Summation of matrices
        Matrix.sum(first,second);
        System.out.println();

        //Multiplication of matrices
        Matrix.multiplication(first,second);
        System.out.println();

        //Multiply matrix by number
        int number = 4;
        Matrix.multiplyByNumber(first,number);

    }
}
