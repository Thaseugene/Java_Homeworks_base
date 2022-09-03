package by.itacademy.hw10.task3;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        StackMax myStack = new StackMax();


        //Реализация стандартных функций
        myStack.push(7);
        myStack.push(11);
        myStack.push(9);
        myStack.push(5);

        System.out.println("Elements that have pushed in the stack: ");
        while (!myStack.stack.empty()) {
            System.out.println(myStack.pop());
        }

        //Дополнительная функция max()
        System.out.printf("\nMax value in the stack - %d\n", myStack.max());
    }

}
