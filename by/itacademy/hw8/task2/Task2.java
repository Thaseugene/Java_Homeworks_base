package by.itacademy.hw8.task2;

public class Task2 {

    public static void main(String[] args) {
        User user = new User("user1201", "aqwed23c2");

        User.Query query = user.new Query();

        query.printToLog();
    }


}
