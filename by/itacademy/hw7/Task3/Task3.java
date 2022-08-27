package by.itacademy.hw7.task3;

import java.util.Locale;

public class Task3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Apple appleOne = new Apple(3.15,"red","Red chif", 3.2);
        Apple appleTwo = new Apple(1.2,"yellow","Golden", 3.2);

        Pear pear = new Pear(3.17,"green", "Delishes", 5.5);

        Apricot apricot = new Apricot(1.05,"yellow", "Belorusskiy", 2.2);

        Basket basket = new Basket(new Fruit[]{appleOne, appleTwo, pear, apricot});
        basket.totalPriceByFruits();
    }
}
