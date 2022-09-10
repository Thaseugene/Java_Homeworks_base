package by.itacademy.hw10.task4.entity;

public abstract class Pet {

    private final String name;
    private final Double price;

    public Pet(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
