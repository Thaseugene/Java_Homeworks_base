package by.itacademy.hw15.task1;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Semaphore sem;
    private Store store;

    public Consumer(Semaphore sem, Store store) {
        this.sem = sem;
        this.store = store;
    }

    @Override
    public void run() {
        while (store.getAmountOfProducts() > 0) {
            try {
                sem.acquire();
                if (store.getAmountOfProducts() == 1) {
                    sem.release();
                    Thread.sleep((int) (Math.random() * 2000));
                } else {
                    store.setAmountOfProducts(store.getAmountOfProducts() - 1);
                    System.out.printf("Customer has bought product. Amount of products in store now - %s\n",
                            store.getAmountOfProducts());
                    sem.release();
                    Thread.sleep((int) (Math.random() * 2000));
                }

            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
