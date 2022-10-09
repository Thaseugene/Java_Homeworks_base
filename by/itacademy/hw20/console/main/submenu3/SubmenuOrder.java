package by.itacademy.hw20.console.main.submenu3;

import by.itacademy.hw20.console.main.MainMenu;
import by.itacademy.hw20.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.console.service.ListPrinter;
import by.itacademy.hw20.console.service.MenuPrinter;
import by.itacademy.hw20.console.service.PrintToConsole;
import by.itacademy.hw20.repositories.CarMasterRepository;
import by.itacademy.hw20.repositories.Garage;
import by.itacademy.hw20.repositories.OrderRepository;
import by.itacademy.hw20.repositories.UserRepository;
import by.itacademy.hw20.service.enums.StandardPhrases;

public class SubmenuOrder {

    private final ActionAddNewOrder actionAddNewOrder = new ActionAddNewOrder();
    private final ActionRemoveOrder actionRemoveOrder = new ActionRemoveOrder();
    private final ActionChangeOrderStatus actionChangeOrderStatus = new ActionChangeOrderStatus();
    private final ActionChangeTime actionChangeTime = new ActionChangeTime();

    public void runSubmenu(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                           CarMasterRepository carMasterRep, SubmenuOrder submenuOrder, MainMenu mainMenu) {

        int selection = 0;
        do {
            printer.printSubmenu3();
            selection = ConsoleScanAssistant.scanInt();
            switch (selection) {
                case 1 -> actionAddNewOrder
                        .addNewOrder(printer, userRep, garage, orderRep, carMasterRep, submenuOrder, mainMenu);
                case 2 -> actionRemoveOrder
                        .removeOrder(printer, userRep, garage, orderRep, carMasterRep, submenuOrder, mainMenu);
                case 3 -> actionChangeOrderStatus
                        .changeStatus(printer, userRep, garage, orderRep, carMasterRep, submenuOrder, mainMenu);
                case 4 -> actionChangeTime
                        .changeTime(printer, userRep, garage, orderRep, carMasterRep, submenuOrder, mainMenu);
                case 5 -> ListPrinter.printList(orderRep.getOrders());
                case 6 -> mainMenu.runMenu(printer, userRep, garage, orderRep, carMasterRep, mainMenu);
                default -> PrintToConsole.print(StandardPhrases.TO_MENU.getText());
            }
        } while (selection != 6);
    }
}
