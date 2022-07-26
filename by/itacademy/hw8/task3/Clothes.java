package by.itacademy.hw8.task3;

public abstract class Clothes {

    private final String producerName;
    private final String color;
    private final String size;
    private double price;

    public Clothes(String producerName, String color, String size, double price) {
        this.producerName = producerName;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

}
