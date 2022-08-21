package by.itacademy.hw7.Task4;

public class Tulip extends Flower{

    private static final String TYPE = "Tulip";

    public Tulip(int height, String name, double cost, int lifeTime, String color) {
        super(height, name, cost, lifeTime, color);
    }

    public String getType() {
        return TYPE;
    }
}
