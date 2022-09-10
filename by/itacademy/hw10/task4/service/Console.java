package by.itacademy.hw10.task4.service;

import by.itacademy.hw10.task4.entity.Cart;
import by.itacademy.hw10.task4.entity.Pet;
import by.itacademy.hw10.task4.entity.PetShop;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Console {

    public static void startConsole(PetShop petShop, Cart cart) {
        int selection = 0;

        do {
            openPrintMenu();
            Scanner scanner = new Scanner(System.in);
            selection = scanner.nextInt();
            switch (selection) {
                case 1: {
                    if (petShop.getMap().isEmpty()) {
                        System.out.println("Sorry, pet shop is empty");
                    } else {
                        Printing.printList(petShop.getMap());
                        openSubmenuChoose(petShop.getMap(),petShop,cart);
                        break;
                    }
                    break;
                }
                case 2: {
                    if (petShop.getMap().isEmpty()) {
                        System.out.println("Sorry, pet shop is empty");
                    } else {
                        Printing.printList(SortFindUtility.sortByKey(petShop.getMap()));
                        openSubmenuChoose(SortFindUtility.sortByKey(petShop.getMap()),petShop,cart);
                        break;
                    }
                    break;
                }
                case 3: {
                    if (petShop.getMap().isEmpty()) {
                        System.out.println("Sorry, pet shop is empty");
                    } else {
                        Printing.printList(SortFindUtility.sortByValue(petShop.getMap()));
                        openSubmenuChoose(SortFindUtility.sortByValue(petShop.getMap()),petShop,cart);
                        break;
                    }
                    break;
                }
                case 4: openSubmenuFind(petShop, cart);
                    break;
                case 5: {
                    if (cart.getMap().isEmpty()) {
                        System.out.println("Your cart is empty");
                    } else {
                        Printing.printList(cart.getMap());
                        System.out.printf("With total cost: %.2f usd\n", CostCalculator.calculate(cart.getMap()));
                        break;
                    }
                    break;
                }
                case 6: break;
                default:
                    System.out.println("\nThe selection was invalid!");
            }
        } while (selection != 6);
    }

    private static void openPrintMenu() {
        System.out.println("\nEnter number to choose menu:");
        System.out.println("[1] Show all pets in the pet shop");
        System.out.println("[2] Sort pets by name");
        System.out.println("[3] Sort pets by price value");
        System.out.println("[4] Find pets by range price value");
        System.out.println("[5] Show pets in the cart");
        System.out.println("[6] Quit");
        System.out.print("Insert selection: ");
    }

    public static void openSubmenuFind(PetShop petShop, Cart cart) {
        double value1 = 0;
        double value2 = 0;
        System.out.println("Enter first value of range: ");
        Scanner scanner = new Scanner(System.in);
        value1 = scanner.nextDouble();
        System.out.println("Enter second value of range: ");
        value2 = scanner.nextDouble();
        Printing.printList(SortFindUtility.findByValue(petShop.getMap(),value1,value2));
        openSubmenuChoose(SortFindUtility.findByValue(petShop.getMap(),value1,value2),petShop,cart);
    }

    public static void openSubmenuChoose(Map<String, Pet> map, PetShop petShop, Cart cart) {
        Set<String> keySet = map.keySet();
        String[] keyArray = keySet.toArray(new String[0]);
        System.out.println("Enter number of pet which want add to cart or [0] for exit: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        if (index == 0) {
            System.out.println("Following to main menu....");
        } else if (index < 0 || index > map.size()) {
            System.out.println("Incorrect number");
        } else {
            String petName = keyArray[index - 1];
            cart.getMap().put(petName,map.get(petName));
            petShop.getMap().remove(petName);
        }
    }
}
