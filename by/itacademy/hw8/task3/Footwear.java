package by.itacademy.hw8.task3;

public abstract class Footwear {

    private final String producerName;
    private final String color;
    private final String size;
    private final String material;
    private final double price;

    public Footwear(String producerName, String color, String size, String material, double price) {
        this.producerName = producerName;
        this.color = color;
        this.size = size;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

}
