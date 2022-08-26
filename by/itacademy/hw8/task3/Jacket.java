package by.itacademy.hw8.task3;

public class Jacket extends Clothes {

    private static final String TYPE = "Jacket";

    public Jacket(String producerName, String color, String size, double price) {
        super(producerName, color, size, price);
    }

    public String getType() {
        return TYPE;
    }
}
