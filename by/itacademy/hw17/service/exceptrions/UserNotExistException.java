package by.itacademy.hw17.service.exceptrions;

public class UserNotExistException extends RuntimeException{

    private String message;

    public UserNotExistException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
