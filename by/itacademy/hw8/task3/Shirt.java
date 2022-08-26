package by.itacademy.hw8.task3;

public class Shirt extends Clothes{

    private static final String TYPE = "Shirt";

    public Shirt(String producerName, String color, String size, double price) {
        super(producerName, color, size, price);
    }

    public String getType() {
        return TYPE;
    }

}
