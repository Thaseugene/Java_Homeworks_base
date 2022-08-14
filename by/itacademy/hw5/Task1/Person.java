package by.itacademy.hw5.Task1;

public class Person {

    String fullName;
    int age;

    void move() {
        System.out.println(fullName + " moving");
    }

    void talk() {
        System.out.println(fullName + " talking");
    }
    public Person() {

    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
