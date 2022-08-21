package by.itacademy.hw7.Task4;

abstract class Flower {

    private int height; //cm

    private String name;

    private double cost; //usd

    private int lifeTime;  //days

    private String color;

    public Flower(int height, String name, double cost, int lifeTime, String color) {
        this.height = height;
        this.name = name;
        this.cost = cost;
        this.lifeTime = lifeTime;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    private void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public abstract String getType();
}
