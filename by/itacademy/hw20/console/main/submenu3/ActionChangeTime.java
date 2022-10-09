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
import by.itacademy.hw20.service.OrderService;
import by.itacademy.hw20.service.enums.StandardPhrases;

public class ActionChangeTime {

    public void changeTime(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                           CarMasterRepository carMasterRep, SubmenuOrder submenu, MainMenu mainMenu) {

        if (orderRep.getOrders().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_ORDERS.getText());
            submenu.runSubmenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
        } else {

            int orderNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CHANGE_ORDER.getText(),
                    orderRep.getOrders());

            if (orderNumber <= 0 || orderNumber > orderRep.getOrders().size()) {
                getBackToMenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
            }

            int orderTime = ConsoleScanAssistant.printAndScanInt(StandardPhrases.ORDER_NEW_TIME.getText());

            if (orderTime <= 0) {
                getBackToMenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
            }

            OrderService.changeOrderTime(orderRep, orderNumber - 1, orderTime);
        }
    }

    private void getBackToMenu(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                               CarMasterRepository carMasterRep, SubmenuOrder submenu, MainMenu mainMenu) {
        PrintToConsole.print(StandardPhrases.TO_MENU.getText());
        submenu.runSubmenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
    }
}

