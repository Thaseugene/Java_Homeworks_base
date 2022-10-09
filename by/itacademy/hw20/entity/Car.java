package by.itacademy.hw20.entity;

public class Car {
    private String number;
    private String producer;
    private String type;

    public Car(String number, String producer, String type) {
        this.number = number;
        this.producer = producer;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public String getProducer() {
        return producer;
    }

    public String getType() {
        return type;
    }
}
