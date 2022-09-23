package by.itacademy.hw11.entity;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private static UserRepository instance;
    private final Map<String, String> users;

    private UserRepository() {
        users = new HashMap<>();
    }

    public static UserRepository getInstance() {
        if(instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public Map<String, String> getUsers() {
        return users;
    }
}
