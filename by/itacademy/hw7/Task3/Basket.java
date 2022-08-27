package by.itacademy.hw7.task3;

public class Basket {

    private Fruit[] fruit;

    public Basket(Fruit[] fruit) {
        this.fruit = fruit;
    }

    public void totalPriceByFruits() {
        double total = 0;
        System.out.println("Price by types of fruits: ");
        for (Fruit fr : fruit) {
            System.out.printf("\n %s %s with weight %.2f kg have(has) price - %.2f usd. ", fr.getType(),
                    fr.getName(), fr.getWeight(), fr.getTotalPrice());
            System.out.print("Information about producer: ");
            fr.printManufacturerInfo();
            total = total + fr.getTotalPrice();
        }
        System.out.printf("\n \n Total price of the whole basket - %.2f usd%n", total);
    }
}
