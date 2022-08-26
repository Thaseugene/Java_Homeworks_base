package by.itacademy.hw8.task3;

import java.util.ArrayList;

public class Cart implements Printable {

    private ArrayList<Footwear> cartFootwearList;
    private ArrayList<Clothes> cartClothesList;

    public Cart(ArrayList<Footwear> cartFootwearList, ArrayList<Clothes> cartClothesList) {
        this.cartFootwearList = cartFootwearList;
        this.cartClothesList = cartClothesList;
    }

    public ArrayList<Footwear> getCartFootwearList() {
        return cartFootwearList;
    }

    public void addCartFootwearList(Footwear footwear) {
        cartFootwearList.add(footwear);
    }

    public ArrayList<Clothes> getCartClothesList() {
        return cartClothesList;
    }

    public void addCartClothesList(Clothes clothes) {
        cartClothesList.add(clothes);
    }

    @Override
    public void printFootwearList() {
        double totalPrice = 0.0;
        System.out.print("\n");
        for (Footwear footwear : cartFootwearList) {
            System.out.println(cartFootwearList.indexOf(footwear) + 1 + ". " + footwear.getType() + " " +
                    footwear.getProducerName() + " " + footwear.getSize() + " " + footwear.getColor() + " " +
                    footwear.getMaterial() + ". Price - " + footwear.getPrice() + " usd.");
            totalPrice = totalPrice + footwear.getPrice();
        }
        System.out.println("Total cost of this cart: " + String.format("%.2f",totalPrice) + " usd");
        System.out.print("\n");
    }

    @Override
    public void printClothesList() {
        double totalPrice = 0.0;
        System.out.print("\n");
        for (Clothes clothes : cartClothesList) {
            System.out.println(cartClothesList.indexOf(clothes) + 1 + ". " + clothes.getType() + " " +
                    clothes.getProducerName() + " " + clothes.getSize() + " " + clothes.getColor() + " " +
                    ". Price - " + clothes.getPrice() + " usd.");
            totalPrice = totalPrice + clothes.getPrice();
        }
        System.out.println("Total cost of this cart: " + String.format("%.2f",totalPrice) + " usd");
        System.out.print("\n");
    }
}

