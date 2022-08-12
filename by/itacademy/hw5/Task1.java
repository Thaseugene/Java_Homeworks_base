package by.itacademy.hw5;

public class Task1 {
    public static void main(String[] args) {
        Person blackPerson = new Person();
        blackPerson.fullName = "Michael";
        blackPerson.age = 34;

        System.out.println(blackPerson.fullName + " is " + blackPerson.age + " years old.");

        blackPerson.move();
        blackPerson.talk();

        Person whitePerson = new Person("Jimmy", 31);

        System.out.println(whitePerson.fullName + " is " + whitePerson.age + " years old.");

        whitePerson.move();
        whitePerson.talk();

    }
}
