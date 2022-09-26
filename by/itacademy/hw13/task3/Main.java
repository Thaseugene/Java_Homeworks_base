package by.itacademy.hw13.task3;

public class Main {

    public static void main(String[] args) {
        MyNumber number = new MyNumber();

        TaskForCount taskForCount = new TaskForCount(number);

        Thread threadOne = new Thread(taskForCount);
        Thread threadTwo = new Thread(taskForCount);
        Thread threadThree = new Thread(taskForCount);

        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}
