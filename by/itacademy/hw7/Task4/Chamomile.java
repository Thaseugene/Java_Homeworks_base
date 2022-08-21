package by.itacademy.hw7.Task4;

public class Chamomile extends Flower{

    private static final String TYPE = "Chamomile";

    public Chamomile(int height, String name, double cost, int lifeTime, String color) {
        super(height, name, cost, lifeTime, color);
    }

    public String getType() {
        return TYPE;
    }
}
