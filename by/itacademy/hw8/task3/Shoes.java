package by.itacademy.hw8.task3;

public class Shoes extends Footwear{

    public static final String TYPE = "Shoes";

    public Shoes(String producerName, String color, String size, String material, double price) {
        super(producerName, color, size, material, price);
    }

    public String getType() {
        return TYPE;
    }
}
