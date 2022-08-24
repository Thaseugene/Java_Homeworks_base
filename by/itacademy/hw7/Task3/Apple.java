package by.itacademy.hw7.task3;

public class Apple extends Fruit{

    private static final String TYPE = "Apple(s)";

    public Apple(double weight, String color, String name, double price) {
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
