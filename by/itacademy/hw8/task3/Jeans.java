package by.itacademy.hw8.task3;

public class Jeans extends Clothes{

    private static final String TYPE = "Jeans";

    public Jeans(String producerName, String color, String size, double price) {
        super(producerName, color, size, price);
    }

    public String getType() {
        return TYPE;
    }

}
