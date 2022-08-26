package by.itacademy.hw8.task3;

import java.util.ArrayList;

public class Cart {

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

    public double getTotalValueFromClothes (ArrayList<Clothes> arrayList) {
        double totalValue = 0.0;
        for (Clothes clothes : arrayList) {
            totalValue = totalValue + clothes.getPrice();
        }
        return totalValue;
    }

    public double getTotalValueFromFootwear (ArrayList<Footwear> arrayList) {
        double totalValue = 0.0;
        for (Footwear footwear : arrayList) {
            totalValue = totalValue + footwear.getPrice();
        }
        return totalValue;
    }

}

