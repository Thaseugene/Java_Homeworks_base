package by.itacademy.hw20.task1.exceptions;

public class WrongLoginException extends RuntimeException{

    private String message;

    public WrongLoginException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
