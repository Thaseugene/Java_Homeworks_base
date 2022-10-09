package by.itacademy.hw20.repositories;

import by.itacademy.hw20.entity.Administrator;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static UserRepository instance;
    private final Map<String, Administrator> users;

    private UserRepository() {
        users = new HashMap<>();
        init();
    }

    public static UserRepository getInstance() {
        if(instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public Map<String, Administrator> getUsers() {
        return users;
    }

    private void init() {
        users.put("Admin", new Administrator("Admin", "Admin"));
    }
}
