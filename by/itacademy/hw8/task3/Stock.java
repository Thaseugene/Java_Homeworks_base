package by.itacademy.hw8.task3;

import java.util.ArrayList;
import java.util.Scanner;


public class Stock implements Printable {

    private ArrayList<Footwear> footwearList;
    private ArrayList<Clothes> clothesList;

    public Stock(ArrayList<Footwear> footwearList, ArrayList<Clothes> clothesList) {
        this.footwearList = footwearList;
        this.clothesList = clothesList;
    }

    public ArrayList<Footwear> getFootwearList() {
        return footwearList;
    }

    public void addInFootList(Footwear... footwear) {
        for (Footwear footwear1 : footwear) {
            footwearList.add(footwear1);
        }
    }

    public ArrayList<Clothes> getClothesList() {
        return clothesList;
    }

    public void addInClothesList(Clothes... clothes) {
        for (Clothes clothes1 : clothes) {
            clothesList.add(clothes1);
        }
    }

    @Override
    public void printFootwearList() {
        System.out.print("\n");
        for (Footwear footwear : footwearList) {
            System.out.println(footwearList.indexOf(footwear) + 1 + ". " + footwear.getType() + " " +
                    footwear.getProducerName() + " " + footwear.getSize() + " " + footwear.getColor() + " " +
                    footwear.getMaterial() + ". Price - " + footwear.getPrice() + " usd.");
        }
        System.out.print("\n");
    }

    @Override
    public void printClothesList() {
        System.out.print("\n");
        for (Clothes clothes : clothesList) {
            System.out.println(clothesList.indexOf(clothes) + 1 + ". " + clothes.getType() + " " +
                    clothes.getProducerName() + " " + clothes.getSize() + " " + clothes.getColor() + " " +
                    ". Price - " + clothes.getPrice() + " usd.");
        }
        System.out.print("\n");
    }


    public ArrayList<Footwear> findFootwearByColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color: ");
        String s = scanner.next();

        ArrayList<Footwear> findList = new ArrayList<>();
        for (Footwear footwear : footwearList) {
            if ((footwear.getColor().toLowerCase()).equals(s.toLowerCase())) {
                findList.add(footwear);
            }
        }
        return findList;
    }

    public ArrayList<Clothes> findClothesByColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color: ");
        String s = scanner.next();
        ArrayList<Clothes> findList = new ArrayList<>();
        for (Clothes clothes : clothesList) {
            if ((clothes.getColor().toLowerCase()).equals(s.toLowerCase())) {
                findList.add(clothes);
            }
        }
        return findList;
    }

    public ArrayList<Footwear> findFootwearBySize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size value: ");
        String s = scanner.next();
        ArrayList<Footwear> findList = new ArrayList<>();
        for (Footwear footwear : footwearList) {
            if ((footwear.getSize().toLowerCase()).equals("size " + s.toLowerCase())) {
                findList.add(footwear);
            }
        }
        return findList;
    }

    public ArrayList<Clothes> findClothesBySize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size value (for example XS, S, M or other): ");
        String s = scanner.next();
        ArrayList<Clothes> findList = new ArrayList<>();
        for (Clothes clothes : clothesList) {
            if ((clothes.getSize().toLowerCase()).equals("size " + s.toLowerCase())) {
                findList.add(clothes);
            }
        }
        return findList;
    }

    public ArrayList<Footwear> findFootwearByKeyWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter keyword (for example boots or Timberland: ");
        String s = scanner.next();
        ArrayList<Footwear> findList = new ArrayList<>();
        for (Footwear footwear : footwearList) {
            if (footwear.getType().toLowerCase().contains(s.toLowerCase())) {
                findList.add(footwear);
            } else if (footwear.getProducerName().toLowerCase().contains(s.toLowerCase())) {
                findList.add(footwear);
            }
        }
        return findList;
    }

    public ArrayList<Clothes> findClothesByKeyWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter keyword (for example dress or H&M: ");
        String s = scanner.next();
        ArrayList<Clothes> findList = new ArrayList<>();
        for (Clothes clothes : clothesList) {
            if (clothes.getType().toLowerCase().contains(s.toLowerCase())) {
                findList.add(clothes);
            } else if (clothes.getProducerName().toLowerCase().contains(s.toLowerCase())) {
                findList.add(clothes);
            }
        }
        return findList;
    }

    public void printFootwearFindList (ArrayList<Footwear> arrayList) {
            System.out.print("\n");
            for (Footwear footwear : arrayList) {
                System.out.println(arrayList.indexOf(footwear) + 1 + ". " + footwear.getType() + " " +
                        footwear.getProducerName() + " " + footwear.getSize() + " " + footwear.getColor() + " " +
                        footwear.getMaterial() + ". Price - " + footwear.getPrice() + " usd.");
            }
            System.out.print("\n");

    }
    public void printClothesFindList (ArrayList<Clothes> arrayList) {
            for (Clothes clothes : arrayList) {
                System.out.println(arrayList.indexOf(clothes) + 1 + ". " + clothes.getType() + " " +
                        clothes.getProducerName() + " " + clothes.getSize() + " " + clothes.getColor() + " " +
                        ". Price - " + clothes.getPrice() + " usd.");
            }
    }
}
