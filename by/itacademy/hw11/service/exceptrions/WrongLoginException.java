package by.itacademy.hw11.service.exceptrions;

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
