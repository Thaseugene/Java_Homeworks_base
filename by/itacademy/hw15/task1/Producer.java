package by.itacademy.hw15.task1;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    Semaphore sem;
    Store store;

    public Producer(Semaphore sem, Store store) {
        this.sem = sem;
        this.store = store;
    }

    @Override
    public void run() {
        while (store.getAmountOfProducts() < store.getMaxSize()+1) {
            try {
                sem.acquire();
                if (store.getAmountOfProducts() == store.getMaxSize()) {
                    sem.release();
                    Thread.sleep((int) (Math.random() * 1000));
                } else {
                    store.setAmountOfProducts(store.getAmountOfProducts() + 1);
                    System.out.printf("One product has been added. Amount of products in store now - %s\n",
                            store.getAmountOfProducts());
                    sem.release();
                    Thread.sleep((int) (Math.random() * 1000));
                }
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void create() {
        try {
            store.setAmountOfProducts(store.getAmountOfProducts() + 1);
            System.out.printf("One product has been added. Amount of products in store now - %s\n",
                    store.getAmountOfProducts());
            Thread.sleep((int) (Math.random() * 900));
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
