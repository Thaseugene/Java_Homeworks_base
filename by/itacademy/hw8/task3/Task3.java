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
                    ArrayList<Footwear> timeList = stock.findFootwearBySize();
                    if (timeList.isEmpty()) {
                        System.out.println("The item hasn't found in stock or incorrect search value\n");
                        break;
                    } else {
                    printFootwearList(timeList);
                    int selection1 = scan();
                    if (selection1 <= 0 || selection1 > timeList.size()) {
                        break;
                    } else {
                        cart.addCartFootwearList(timeList.get(selection1-1));
                    }
                    }
                    break;
                }
                case 2: {
                    ArrayList<Footwear> timeList = stock.findFootwearByColor();
                    if (timeList.isEmpty()) {
                        System.out.println("The item hasn't found in stock or incorrect search value\n");
                        break;
                    } else {
                        printFootwearList(timeList);
                        int selection1 = scan();
                        if (selection1 <= 0 || selection1 > timeList.size()) {
                            break;
                        } else {
                            cart.addCartFootwearList(timeList.get(selection1 - 1));
                        }
                    }
                    break;
                }
                case 3: {
                    ArrayList<Clothes> timeList = stock.findClothesBySize();
                    if (timeList.isEmpty()) {
                        System.out.println("The item hasn't found in stock or incorrect search value\n");
                        break;
                    } else {
                        printClothesList(timeList);
                        int selection1 = scan();
                        if (selection1 <= 0 || selection1 > timeList.size()) {
                            break;
                        } else {
                            cart.addCartClothesList(timeList.get(selection1-1));
                        }
                    }
                    break;
                }
                case 4: {
                    ArrayList<Clothes> timeList = stock.findClothesByColor();
                    if (timeList.isEmpty()) {
                        System.out.println("The item hasn't found in stock or incorrect search value\n");
                        break;
                    } else {
                        printClothesList(timeList);
                        int selection1 = scan();
                        if (selection1 <= 0 || selection1 > timeList.size()) {
                            break;
                        } else {
                            cart.addCartClothesList(timeList.get(selection1 - 1));
                        }
                    }
                    break;
                }
                case 5: {
                    ArrayList<Footwear> timeList = stock.findFootwearByKeyWord();
                    if (timeList.isEmpty()) {
                        System.out.println("The item hasn't found in stock or incorrect search value\n");
                        break;
                    } else {
                        printFootwearList(timeList);
                        int selection1 = scan();
                        if (selection1 <= 0 || selection1 > timeList.size()) {
                            break;
                        } else {
                            cart.addCartFootwearList(timeList.get(selection1 - 1));
                        }
                    }
                    break;
                }
                case 6: {
                    ArrayList<Clothes> timeList = stock.findClothesByKeyWord();
                    if (timeList.isEmpty()) {
                        System.out.println("The item hasn't found in stock or incorrect search value\n");
                        break;
                    } else {
                        printClothesList(timeList);
                        int selection1 = scan();
                        if (selection1 <= 0 || selection1 > timeList.size()) {
                            break;
                        } else {
                            cart.addCartClothesList(timeList.get(selection1 - 1));
                        }
                    }
                    break;
                }
                case 7: {
                    printFootwearList(stock.getFootwearList());
                    int selection1 = scan();
                    if (selection1 <= 0 || selection1 > stock.getFootwearList().size()) {
                        break;
                    } else {
                        cart.addCartFootwearList(stock.getFootwearList().get(selection1-1));
                    }
                    break;
                }
                case 8: {
                    printClothesList(stock.getClothesList());
                    int selection1 = scan();
                    if (selection1 <= 0 || selection1 > stock.getClothesList().size()) {
                        break;
                    } else {
                        cart.addCartClothesList(stock.getClothesList().get(selection1-1));
                    }
                    break;
                }
                case 9: {
                    printFootwearList(cart.getCartFootwearList());
                    System.out.printf("Total cost of this cart: %.2f usd\n\n",
                            cart.getTotalValueFromFootwear(cart.getCartFootwearList()));
                    break;
                }
                case 10: {
                    printClothesList(cart.getCartClothesList());
                    System.out.printf("Total cost of this cart: %.2f usd\n\n",
                            cart.getTotalValueFromClothes(cart.getCartClothesList()));
                    break;
                }
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

    public static void printClothesList(ArrayList<Clothes> arrayList) {
        for (Clothes clothes : arrayList) {
            System.out.printf("\n %d. %s %s %s %s. Price - %.2f usd.", arrayList.indexOf(clothes) + 1,
                    clothes.getType(), clothes.getProducerName(), clothes.getSize(), clothes.getColor(),
                    clothes.getPrice());
        }
        System.out.println("\n");
    }

    public static void printFootwearList (ArrayList<Footwear> arrayList) {
        for (Footwear footwear : arrayList) {
            System.out.printf("\n %d. %s %s %s %s %s. Price - %.2f usd.", arrayList.indexOf(footwear) + 1,
                    footwear.getType(), footwear.getProducerName(), footwear.getSize(), footwear.getColor(),
                    footwear.getMaterial(), footwear.getPrice());
        }
        System.out.println("\n");
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
