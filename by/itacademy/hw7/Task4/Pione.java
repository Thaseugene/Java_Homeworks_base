package by.itacademy.hw7.task4;

public class Pione extends Flower {

    private static final String TYPE = "Pione";

    public Pione(int height, String name, double cost, int lifeTime, String color) {
        super(height, name, cost, lifeTime, color);
    }

    public String getType() {
        return TYPE;
    }
}
