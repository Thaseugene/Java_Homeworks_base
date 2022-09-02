package by.itacademy.hw10.task3;

import java.util.Stack;
/*
Реализуйте свой собственный стек (очередь LIFO) со стандартными функциями push() и pop(), а также с
дополнительной функцией max().
 */

public class StackMax extends Stack<Integer> {

    public Stack<Integer> stack;
    private int maxValue;

    public StackMax() {
        stack = new Stack<>();
        maxValue = 0;
    }

    public void push(int value) {
        if (stack.isEmpty()) {
            maxValue = value;
        }
            super.push(value);
        }

    public Integer pop() {
        int value = super.pop();
        if (maxValue < value) {
            maxValue = value;
        }
        return value;
    }

    public int max() {
        return maxValue;
    }
}