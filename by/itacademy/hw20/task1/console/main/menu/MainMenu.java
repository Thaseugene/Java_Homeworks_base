package by.itacademy.hw20.task1.console.main.menu;

import by.itacademy.hw20.task1.console.main.collector.MenuCollector;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.MenuPrinter;


public class MainMenu {
    private static MainMenu instance;
    private final MenuCollector menuCollector;

    public MainMenu() {
        this.menuCollector = MenuCollector.getInstance();
    }


    public void runMenu() {
        int selection = 0;
        while (selection != 4) {
            MenuPrinter.printMainMenu();
            selection = ConsoleScanAssistant.scanInt();
            try {
                menuCollector.getMenuMap().get(selection).runMenu();
            } catch (NullPointerException ex) {
                System.out.println("Incorrect number");
            }
        }
    }

    public static MainMenu getInstance() {
        if (instance == null) {
            instance = new MainMenu();
        }
        return instance;
    }

    public MenuCollector getMenuCollector() {
        return menuCollector;
    }
}
