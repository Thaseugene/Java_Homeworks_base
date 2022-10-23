package by.itacademy.hw20.task1.entity;

import by.itacademy.hw20.task1.entity.enums.CarType;

public class Car {
    private String number;
    private String producer;
    private CarType type;

    public Car(String number, String producer, CarType type) {
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

    public CarType getType() {
        return type;
    }
}
