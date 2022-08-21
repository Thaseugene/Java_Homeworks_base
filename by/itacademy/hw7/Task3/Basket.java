package by.itacademy.hw7.Task3;

public class Basket  {

    private Fruit[] fruit;

    public Basket(Fruit[] fruit) {
        this.fruit = fruit;
    }
    public void totalPriceByFruits() {
        double total = 0;
        System.out.println("Price by types of fruits: ");
        for (Fruit fr : fruit) {
            System.out.print("\n" + fr.getType() + " \"" + fr.getName() + "\" with weight " + fr.getWeight() +
                    " kg have(has) price - " + String.format("%.2f",fr.getTotalPrice()) + " usd. ");
            System.out.print("Information about producer: ");
            fr.printManufacturerInfo();
            total = total + fr.getTotalPrice();
        }
        System.out.println("\n"+"\nTotal price of the whole basket - " + String.format("%.2f",total) + " usd");
    }
}
