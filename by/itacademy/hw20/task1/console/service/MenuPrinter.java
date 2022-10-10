package by.itacademy.hw20.task1.console.service;

public class MenuPrinter {

    public void printMainMenu() {
        System.out.println("\nEnter number to choose menu:");
        System.out.println("[1] Change/add car in garage");
        System.out.println("[2] Add/remove master");
        System.out.println("[3] Enter order menu");
        System.out.println("[4] Quit");
        System.out.print("Insert selection: ");
    }

    public void printAuthMenu() {
        System.out.println("\nEnter number to choose menu:");
        System.out.println("[1] Sign in to Administrator");
        System.out.println("[2] Create new Administrator account");
        System.out.println("[3] Quit");
        System.out.print("Insert selection: ");
    }

    public void printSubmenu1() {
        System.out.println("\nEnter number to choose menu:");
        System.out.println("[1] Add new car");
        System.out.println("[2] Remove car");
        System.out.println("[3] Show cars in garage");
        System.out.println("[4] To main menu");
        System.out.print("Insert selection: ");
    }

    public void printSubmenu2() {
        System.out.println("\nEnter number to choose menu:");
        System.out.println("[1] Add new master");
        System.out.println("[2] Remove master");
        System.out.println("[3] Show all masters");
        System.out.println("[4] To main menu");
        System.out.print("Insert selection: ");
    }
    public void printSubmenu3() {
        System.out.println("\nEnter number to choose menu:");
        System.out.println("[1] Add new order");
        System.out.println("[2] Remove order");
        System.out.println("[3] Change order status");
        System.out.println("[4] Change order time");
        System.out.println("[5] Show all orders");
        System.out.println("[6] To main menu");
        System.out.print("Insert selection: ");
    }


}
