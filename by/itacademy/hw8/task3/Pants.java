package by.itacademy.hw8.task3;

public class Pants extends Clothes{

    private static final String TYPE = "Pants";

    public Pants(String producerName, String color, String size, double price) {
        super(producerName, color, size, price);
    }

    public String getType() {
        return TYPE;
    }
}
