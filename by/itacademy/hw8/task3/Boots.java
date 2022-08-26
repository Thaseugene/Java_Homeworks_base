package by.itacademy.hw8.task3;

public class Boots extends Footwear{

    private static final String TYPE = "Boots";

    public Boots(String producerName, String color, String size, String material, double price) {
        super(producerName, color, size, material, price);
    }

    public String getType() {
        return TYPE;
    }
}
