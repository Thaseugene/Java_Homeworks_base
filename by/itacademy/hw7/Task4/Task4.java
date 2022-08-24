package by.itacademy.hw7.task4;

import java.util.Locale;

public class Task4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Flower roseOne = new Rose(48, "Charity", 1.5, 3, "red");
        Flower roseTwo = new Rose (58, "Miranda", 3.2, 2, "white");

        Flower pione = new Pione(65, "Citeria", 5.1, 2, "pink");

        Flower tulip = new Tulip(45,"Cummins", 1.1, 1, "white");

        Flower chamomile = new Chamomile(25, "Stefania", 0.5, 3, "yellow");

        Bouquet bouquet = new Bouquet(new Flower[]{roseOne, roseTwo, chamomile, tulip, pione});

        System.out.println("\nHierarchy of bouquet by its height: ");
        bouquet.hierarchyBouquet();

        System.out.println("\nTotal cost of the bouquet - " + String.format("%.2f",bouquet.getTotalCost()) + " usd");

        System.out.println("\nThe bouquet is completely going down after - " + bouquet.bouquetLifetime() + " days");
    }
}
