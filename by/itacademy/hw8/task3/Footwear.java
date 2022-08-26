package by.itacademy.hw8.task3;

public abstract class Footwear {

    private String producerName;
    private String color;
    private String size;
    private String material;

    private double price;

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

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getType();

}
