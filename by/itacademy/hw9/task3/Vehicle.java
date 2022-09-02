package by.itacademy.hw9.task3;

public abstract class Vehicle {

    private final int wheelNumber;
    private final String producer;
    private final String engine;

    public Vehicle(int wheelNumber, String producer, String engine) {
        this.wheelNumber = wheelNumber;
        this.producer = producer;
        this.engine = engine;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public String getProducer() {
        return producer;
    }

    public String getEngine() {
        return engine;
    }
}
