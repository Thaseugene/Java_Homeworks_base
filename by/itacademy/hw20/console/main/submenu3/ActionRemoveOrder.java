package by.itacademy.hw20.console.main.submenu3;

import by.itacademy.hw20.console.main.MainMenu;
import by.itacademy.hw20.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.console.service.MenuPrinter;
import by.itacademy.hw20.console.service.PrintToConsole;
import by.itacademy.hw20.repositories.CarMasterRepository;
import by.itacademy.hw20.repositories.Garage;
import by.itacademy.hw20.repositories.OrderRepository;
import by.itacademy.hw20.repositories.UserRepository;
import by.itacademy.hw20.service.OrderService;
import by.itacademy.hw20.service.enums.StandardPhrases;

public class ActionRemoveOrder {

    public void removeOrder(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                            CarMasterRepository carMasterRep, SubmenuOrder submenu, MainMenu mainMenu) {
        if (orderRep.getOrders().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_ORDERS.getText());
            submenu.runSubmenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
        } else {

            int orderNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.ORDER_REMOVE.getText(),
                    orderRep.getOrders());

            if (orderNumber <= 0 || orderNumber > orderRep.getOrders().size()) {
                PrintToConsole.print(StandardPhrases.TO_MENU.getText());
                submenu.runSubmenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
            }

            OrderService.removeOrder(orderRep, orderNumber);

        }
    }
}
