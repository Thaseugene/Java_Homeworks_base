package by.itacademy.hw8.task2;

import java.util.Objects;

public class User {

    private String userLogin;
    private String userPassword;

    public User(String userLogin, String userPassword) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public class Query {
        public void printToLog() {
            System.out.println("User - " + userLogin + " with password - " + userPassword + " has a query.");
        }
    }

}
