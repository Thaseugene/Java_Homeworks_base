package by.itacademy.hw8.task3;

public class Dress extends Clothes{

    private static final String TYPE = "Dress";

    public Dress(String producerName, String color, String size, double price) {
        super(producerName, color, size, price);
    }

    public String getType() {
        return TYPE;
    }
}
