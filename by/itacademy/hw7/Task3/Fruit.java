package by.itacademy.hw7.task3;

abstract class Fruit {

    private double weight;

    private String color;

    private String name;

    private double price; //Price per one kilo

    public Fruit(double weight, String color, String name, double price) {
        this.weight = weight;
        this.color = color;
        this.name = name;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double getTotalPrice();

    public abstract String getType();

    public void printManufacturerInfo () {
        System.out.print("Made in Belarus");
    }

}
