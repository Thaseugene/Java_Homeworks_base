package by.itacademy.hw10.task3;

import java.util.LinkedList;
/*
Реализуйте свой собственный стек (очередь LIFO) со стандартными функциями push() и pop(), а также с
дополнительной функцией max().
 */

public class StackMax {

    public LinkedList<Integer> stack;
    private int maxValue;

    public StackMax() {
        stack = new LinkedList<>();
        maxValue = 0;
    }

    public void push(int value) {
        if (stack.isEmpty()) {
            maxValue = value;
        }
            stack.addFirst(value);
        }

    public Integer pop() {
        int value = stack.removeFirst();
        if (maxValue < value) {
            maxValue = value;
        }
        return value;
    }

    public int max() {
        return maxValue;
    }


}