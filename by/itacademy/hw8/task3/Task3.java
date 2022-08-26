package by.itacademy.hw8.task3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Footwear boots = new Boots("Timberland", "White", FootwearSize.SIZE_36.getSizeValue(),
                "leather",33.5);
        Footwear shoes = new Shoes("Jimmy Choo", "Black", FootwearSize.SIZE_35.getSizeValue(),
                "leather",30.1);
        Footwear shoesOne = new Shoes("Jimmy Choo", "Brown", FootwearSize.SIZE_37.getSizeValue(),
                "leather",32.4);
        Footwear bootsOne = new Boots("Timberland", "Black", FootwearSize.SIZE_36.getSizeValue(),
                "leather",35.4);

       Clothes dress = new Dress("Dolce&Gabbana", "White", ClothesSize.SIZE_L.getValueSize(),
               37.5);
       Clothes jacket = new Jacket("H&M","Black", ClothesSize.SIZE_XL.getValueSize(), 25.1);
       Clothes jeans = new Jeans("Levis", "Blue", ClothesSize.SIZE_M.getValueSize(), 33.7);
       Clothes pants = new Pants("HUGO BOSS", "Gray", ClothesSize.SIZE_M.getValueSize(), 80.9);
       Clothes shirt = new Shirt("Armani", "White", ClothesSize.SIZE_S.getValueSize(), 55.5);

        Stock stock = new Stock(new ArrayList<>(),new ArrayList<>());
        stock.addInFootList(boots, shoes, shoesOne, bootsOne);
        stock.addInClothesList(dress,jacket,jeans,pants,shirt);

        Cart cart = new Cart(new ArrayList<>(), new ArrayList<>());

        System.out.println("Welcome to our console store. Please choose the menu by number");
        int selection = 0;
        do {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            selection = scanner.nextInt();
            switch (selection) {
                case 1: {
                    ArrayList<Footwear> tempList = stock.findFootwearBySize();
                    if (tempList.isEmpty()) {
                        System.out.println("The item hasn't found in stock or incorrect search value\n");
                        break;
                    } else {
                    stock.printFootwearFindList(tempList);
                    int selection1 = scan();
                    if (selection1 <= 0 || selection1 > tempList.size()) {
                        break;
                    } else {
                        cart.addCartFootwearList(tempList.get(selection1-1));
                    }
                    }
                    break;
                }
                case 2: {
                    ArrayList<Footwear> tempList = stock.findFootwearByColor();
                    if (tempList.isEmpty()) {
                        System.out.println("The item hasn't found in stock or incorrect search value\n");
                        break;
                    } else {
                        stock.printFootwearFindList(tempList);
                        int selection1 = scan();
                        if (selection1 <= 0 || selection1 > tempList.size()) {
                            break;
                        } else {
                            cart.addCartFootwearList(tempList.get(selection1 - 1));
                        }
                    }
                    break;
                }
                case 3: {
                    ArrayList<Clothes> tempList = stock.findClothesBySize();
                    if (tempList.isEmpty()) {
                        System.out.println("The item hasn't found in stock or incorrect search value\n");
                        break;
                    } else {
                        stock.printClothesFindList(tempList);
                        int selection1 = scan();
                        if (selection1 <= 0 || selection1 > tempList.size()) {
                            break;
                        } else {
                            cart.addCartClothesList(tempList.get(selection1-1));
                        }
                    }
                    break;
                }
                case 4: {
                    ArrayList<Clothes> tempList = stock.findClothesByColor();
                    if (tempList.isEmpty()) {
                        System.out.println("The item hasn't found in stock or incorrect search value\n");
                        break;
                    } else {
                        stock.printClothesFindList(tempList);
                        int selection1 = scan();
                        if (selection1 <= 0 || selection1 > tempList.size()) {
                            break;
                        } else {
                            cart.addCartClothesList(tempList.get(selection1 - 1));
                        }
                    }
                    break;
                }
                case 5: {
                    ArrayList<Footwear> tempList = stock.findFootwearByKeyWord();
                    if (tempList.isEmpty()) {
                        System.out.println("The item hasn't found in stock or incorrect search value\n");
                        break;
                    } else {
                        stock.printFootwearFindList(tempList);
                        int selection1 = scan();
                        if (selection1 <= 0 || selection1 > tempList.size()) {
                            break;
                        } else {
                            cart.addCartFootwearList(tempList.get(selection1 - 1));
                        }
                    }
                    break;
                }
                case 6: {
                    ArrayList<Clothes> tempList = stock.findClothesByKeyWord();
                    if (tempList.isEmpty()) {
                        System.out.println("The item hasn't found in stock or incorrect search value\n");
                        break;
                    } else {
                        stock.printClothesFindList(tempList);
                        int selection1 = scan();
                        if (selection1 <= 0 || selection1 > tempList.size()) {
                            break;
                        } else {
                            cart.addCartClothesList(tempList.get(selection1 - 1));
                        }
                    }
                    break;
                }
                case 7: {
                    ArrayList<Footwear> tempList = stock.getFootwearList();
                    stock.printFootwearList();
                    int selection1 = scan();
                    if (selection1 <= 0 || selection1 > tempList.size()) {
                        break;
                    } else {
                        cart.addCartFootwearList(tempList.get(selection1-1));
                    }
                    break;
                }
                case 8: {
                    ArrayList<Clothes> tempList = stock.getClothesList();
                    stock.printClothesList();
                    int selection1 = scan();
                    if (selection1 <= 0 || selection1 > tempList.size()) {
                        break;
                    } else {
                        cart.addCartClothesList(tempList.get(selection1-1));
                    }
                    break;
                }
                case 9: cart.printFootwearList();
                    break;
                case 10: cart.printClothesList();
                    break;
                case 11: break;
                default:
                    System.out.println("The selection was invalid!");
            }
        } while (selection != 11);
    }

    public static int scan() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Insert case number of item which you want add to cart (1, 2, 3 or else) " +
                "or press [0] to leave the menu");
        return scanner1.nextInt();
    }

    public static void printMenu() {
        System.out.println("[1] Find footwear by size");
        System.out.println("[2] Find footwear by color");
        System.out.println("[3] Find clothes by size");
        System.out.println("[4] Find clothes by color");
        System.out.println("[5] Find footwear by keyword");
        System.out.println("[6] Find clothes by keyword");
        System.out.println("[7] Find all footwear items in stock");
        System.out.println("[8] Find all clothes items in stock");
        System.out.println("[9] Print footwear cart");
        System.out.println("[10] Print clothes cart");
        System.out.println("[11] Quit");
        System.out.print("Insert selection: ");
    }
}
