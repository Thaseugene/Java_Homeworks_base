package by.itacademy.hw20.task1.console.main;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.MenuPrinter;
import by.itacademy.hw20.task1.console.main.submenu1.SubmenuGarage;
import by.itacademy.hw20.task1.console.main.submenu2.SubmenuMaster;
import by.itacademy.hw20.task1.console.main.submenu3.SubmenuOrder;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;
import by.itacademy.hw20.task1.repositories.Garage;
import by.itacademy.hw20.task1.repositories.OrderRepository;
import by.itacademy.hw20.task1.repositories.UserRepository;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

public class MainMenu {
    private final MenuPrinter menuPrinter;
    private final SubmenuMaster submenuMaster;
    private final SubmenuOrder submenuOrder;
    private final SubmenuGarage submenuGarage;

    public MainMenu(Garage garage, CarMasterRepository carMasterRep, OrderRepository orderRep, UserRepository userRep,
                    MenuPrinter menuPrinter) {
        this.menuPrinter = menuPrinter;
        this.submenuGarage = new SubmenuGarage(garage, menuPrinter);
        this.submenuMaster = new SubmenuMaster(carMasterRep, menuPrinter);
        this.submenuOrder = new SubmenuOrder(garage, carMasterRep, orderRep, menuPrinter);
    }

    public void runMenu(MainMenu mainMenu) {
        int selection;
        do {
            menuPrinter.printMainMenu();
            selection = ConsoleScanAssistant.scanInt();
            switch (selection) {
                case 1 -> submenuGarage.runSubmenu(submenuGarage, mainMenu);
                case 2 -> submenuMaster.runSubmenu(submenuMaster, mainMenu);
                case 3 -> submenuOrder.runSubmenu(submenuOrder, mainMenu);
                case 4 -> System.exit(0);
                default -> PrintToConsole.print(StandardPhrases.SELECT_INVALID.getText());
            }
        } while (true);
    }
}
