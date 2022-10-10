package by.itacademy.hw17.service;

import by.itacademy.hw17.entity.User;
import by.itacademy.hw17.entity.UserRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class RegistrationDatesFinder {

    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public void findByDate(UserRepository userRepository, LocalDateTime dateStart, LocalDateTime dateEnd) {
        List<User> list = new ArrayList<>();
        userRepository.getUsers().entrySet().stream()
                .filter(s -> s.getValue().getRegistrationDate().isAfter(dateStart) &&
                        s.getValue().getRegistrationDate().isBefore(dateEnd)).forEach(s -> list.add(s.getValue()));
        if (list.isEmpty()) {
            System.out.println("Users not found");
        } else {
            list.forEach(s -> System.out.println(s.getLogin() + " " + s.getRegistrationDate().format(FORMATTER)));
        }
    }
}
