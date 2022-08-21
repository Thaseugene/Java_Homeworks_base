package by.itacademy.hw7.Task3;

public class Apricot extends Fruit{

    private static final String TYPE = "Apricot(s)";

    public Apricot(double weight, String color, String name, double price) {
        super(weight, color, name, price);
    }

    @Override
    public double getTotalPrice() {
        return this.getPrice()*this.getWeight();
    }

    public String getType() {
        return TYPE;
    }
}
