package by.itacademy.hw7.Task4;

public class Rose extends Flower {

    private static final String TYPE = "Rose";

    public Rose(int height, String name, double cost, int lifeTime, String color) {
        super(height, name, cost, lifeTime, color);
    }

    public String getType() {
        return TYPE;
    }
}
