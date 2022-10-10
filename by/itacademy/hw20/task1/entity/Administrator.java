package by.itacademy.hw20.task1.entity;

public class Administrator {

    private String login;
    private String password;

    public Administrator(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
