package by.itacademy.hw8.task2;

public class User {

    //Пользователь имеет логин и пароль
    private final String userLogin;
    private final String userPassword;

    public User(String userLogin, String userPassword) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
    }

    //содержит внутренний класс Query
    public class Query {
        /* Запрос содержит метод printToLog(), который распечатывает сообщение о том, что пользователь с таким-то
        логином и паролем отправил запрос */
        public void printToLog() {
            System.out.printf("\nUser - %s with password - %s has a query.", userLogin, userPassword);
        }
    }
}
