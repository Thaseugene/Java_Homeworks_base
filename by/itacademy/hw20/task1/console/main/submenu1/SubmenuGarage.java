package by.itacademy.hw20.task1.console.main.submenu1;

import by.itacademy.hw20.task1.console.main.MainMenu;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.ListPrinter;
import by.itacademy.hw20.task1.console.service.MenuPrinter;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;
import by.itacademy.hw20.task1.repositories.Garage;
import by.itacademy.hw20.task1.repositories.OrderRepository;
import by.itacademy.hw20.task1.repositories.UserRepository;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

public class SubmenuGarage {

    private ActionRemoveCar actionRemoveCar = new ActionRemoveCar();
    private ActionAddCar actionAddCar = new ActionAddCar();

    public void runSubmenu(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                                  CarMasterRepository carMasterRep, SubmenuGarage submenuGarage, MainMenu mainMenu) {
        int selection = 0;
        do {
            printer.printSubmenu1();
            selection = ConsoleScanAssistant.scanInt();
            switch (selection) {
                case 1 -> actionAddCar.addCar(garage);
                case 2 -> actionRemoveCar
                        .removeCar(printer, userRep, garage, orderRep, carMasterRep, submenuGarage, mainMenu);
                case 3 -> ListPrinter.printList(garage.getCarRepository());
                case 4 -> mainMenu.runMenu(printer, userRep, garage, orderRep, carMasterRep, mainMenu);
                default -> PrintToConsole.print(StandardPhrases.TO_MENU.getText());
            }
        } while (selection != 4);
    }
}
