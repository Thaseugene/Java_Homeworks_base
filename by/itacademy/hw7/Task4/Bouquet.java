package by.itacademy.hw7.Task4;

public class Bouquet {

    private Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public int bouquetLifetime() {
        int bouquetLifetime = flowers[0].getLifeTime();
        for (int i = 1; i < flowers.length; i++) {
            if (bouquetLifetime < flowers[i].getLifeTime()) {
                bouquetLifetime = flowers[i].getLifeTime();
            }
        }
        return bouquetLifetime;
    }

    //I'm not a florist, and don't know types of hierarchy in bouquets. I've chosen hierarchy by height.
    public void hierarchyBouquet() {
        String hierarchy = new String("");
        for (int i = 0; i < flowers.length - 1; i++){
            for (int j = 0; j < flowers.length - i - 1; j++) {
                if (flowers[j+1].getHeight() > flowers[j].getHeight()) {
                    Flower timeFlower = flowers[j];
                    flowers[j] = flowers[j+1];
                    flowers[j+1] = timeFlower;
                }
            }
        }
        for (Flower fl : flowers) {
            System.out.println(fl.getType() + " \"" + fl.getName() + "\" " + " with color " + fl.getColor());
        }
    }

    public double getTotalCost() {
        double total = 0.0;
        for (Flower fl : flowers) {
            total = total + fl.getCost();
        }
        return total;
        }

}