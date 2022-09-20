package by.itacademy.hw15.task1;

public class Store {

    private int amountOfProducts = 0;

    private static final int MAX_SIZE = 5;

    public int getMaxSize() {
        return MAX_SIZE;
    }

    public int getAmountOfProducts() {
        return amountOfProducts;
    }

    public void setAmountOfProducts(int amountOfProducts) {
        this.amountOfProducts = amountOfProducts;
    }
}
