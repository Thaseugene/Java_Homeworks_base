package by.itacademy.hw7.task4;

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

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String getType();
}
