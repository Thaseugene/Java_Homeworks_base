package by.itacademy.hw20.console.exceptions;

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
