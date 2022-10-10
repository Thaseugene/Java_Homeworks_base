package by.itacademy.hw17.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class User {

    private String login;
    private String password;

    private final LocalDateTime registrationDate;

    private LocalDateTime lastAuthorizationDate;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.registrationDate = LocalDateTime.now();
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public LocalDateTime getLastAuthorizationDate() {
        return lastAuthorizationDate;
    }

    public void setLastAuthorizationDate() {
        this.lastAuthorizationDate = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }


}
