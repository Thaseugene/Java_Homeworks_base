package by.itacademy.hw20.task1.console.main.submenu1;

import by.itacademy.hw20.task1.console.main.MainMenu;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.ListPrinter;
import by.itacademy.hw20.task1.console.service.MenuPrinter;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.Garage;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

public class SubmenuGarage {
    private final Garage garage;
    private final MenuPrinter menuPrinter;

    private final ActionRemoveCar actionRemoveCar;
    private final ActionAddCar actionAddCar;

    public SubmenuGarage(Garage garage, MenuPrinter menuPrinter) {
        this.garage = garage;
        this.menuPrinter = menuPrinter;
        this.actionRemoveCar = new ActionRemoveCar(garage);
        this.actionAddCar = new ActionAddCar(garage);
    }

    public void runSubmenu(SubmenuGarage submenuGarage, MainMenu mainMenu) {
        int selection;
        do {
            menuPrinter.printSubmenu1();
            selection = ConsoleScanAssistant.scanInt();
            switch (selection) {
                case 1 -> actionAddCar.addCar();
                case 2 -> actionRemoveCar.removeCar(submenuGarage, mainMenu);
                case 3 -> ListPrinter.printList(garage.getCarRepository());
                case 4 -> mainMenu.runMenu(mainMenu);
                default -> PrintToConsole.print(StandardPhrases.TO_MENU.getText());
            }
        } while (selection != 4);
    }
}
