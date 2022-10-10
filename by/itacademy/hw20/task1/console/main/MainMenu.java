package by.itacademy.hw20.task1.console.main;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.MenuPrinter;
import by.itacademy.hw20.task1.console.main.submenu1.SubmenuGarage;
import by.itacademy.hw20.task1.console.main.submenu2.SubmenuMaster;
import by.itacademy.hw20.task1.console.main.submenu3.SubmenuOrder;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;
import by.itacademy.hw20.task1.repositories.Garage;
import by.itacademy.hw20.task1.repositories.OrderRepository;
import by.itacademy.hw20.task1.repositories.UserRepository;

public class MainMenu {

    private SubmenuMaster submenuMaster = new SubmenuMaster();
    private SubmenuOrder submenuOrder = new SubmenuOrder();
    private SubmenuGarage submenuGarage = new SubmenuGarage();

    public void runMenu(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                               CarMasterRepository carMasterRep, MainMenu mainMenu) {
        int selection = 0;
        do {
            printer.printMainMenu();
            selection = ConsoleScanAssistant.scanInt();
            switch (selection) {
                case 1 -> submenuGarage.runSubmenu(printer,userRep,garage,orderRep,carMasterRep,submenuGarage, mainMenu);
                case 2 -> submenuMaster.runSubmenu(printer,userRep,garage,orderRep,carMasterRep,submenuMaster, mainMenu);
                case 3 -> submenuOrder.runSubmenu(printer,userRep,garage,orderRep,carMasterRep,submenuOrder, mainMenu);
                case 4 -> System.exit(0);
                default -> System.out.println("Selection was invalid");
            }
        } while (selection != 4);
    }
}
