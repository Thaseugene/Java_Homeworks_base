package by.itacademy.hw20.task1.console.exceptions;

public class WrongPasswordException extends RuntimeException{
    private String message;

    public WrongPasswordException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
