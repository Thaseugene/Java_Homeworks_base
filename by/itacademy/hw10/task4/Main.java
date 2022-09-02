package by.itacademy.hw10.task4;

import by.itacademy.hw10.task4.entity.*;
import by.itacademy.hw10.task4.service.Console;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        PetShop petShop = new PetShop();
        Cart cart = new Cart();

        Dog dog = new Dog("Bobik", 22.7);
        Dog dogOne = new Dog("Borbos", 37.6);
        Dog dogTwo = new Dog("Hunter", 62.1);
        Dog dogThree = new Dog("Biggles", 62.1);
        Cat cat = new Cat("Murka", 12.1);
        Cat catOne = new Cat("Koteika", 34.3);
        Cat catTwo = new Cat("Barsik", 29.1);
        Cat catThree = new Cat("Vrednaya", 29.1);
        Parrot parrot = new Parrot("Gosha", 51.2);
        Parrot parrotOne = new Parrot("Pterodactyl", 46.2);
        Parrot parrotTwo = new Parrot("Letuchiy", 84.1);
        Parrot parrotThree = new Parrot("Golubiny", 84.1);


        petShop.addPet(dog, dogOne, dogTwo, dogThree, cat, catOne, catTwo, catThree, parrot, parrotOne, parrotTwo,
                parrotThree);

        Console.startConsole(petShop, cart);
    }
}
