package by.itacademy.hw7.Task3;

abstract class Fruit {

    private double weight;

    private String color;

    private String name;

    private double price; //Price per one kilo

    public Fruit() {
    }

    public Fruit(double weight, String color, String name, double price) {
        this.weight = weight;
        this.color = color;
        this.name = name;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printManufacturerInfo () {
        System.out.print("Maid in Belarus");
    }

    public abstract double getTotalPrice();

    public abstract String getType();
}
