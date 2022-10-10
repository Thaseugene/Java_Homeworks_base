package by.itacademy.hw20.task1.console.main.submenu3;

import by.itacademy.hw20.task1.console.main.MainMenu;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.MenuPrinter;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;
import by.itacademy.hw20.task1.repositories.Garage;
import by.itacademy.hw20.task1.repositories.OrderRepository;
import by.itacademy.hw20.task1.repositories.UserRepository;
import by.itacademy.hw20.task1.service.OrderService;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

public class ActionRemoveOrder {
    private final OrderRepository orderRep;

    public ActionRemoveOrder(OrderRepository orderRep) {
        this.orderRep = orderRep;
    }

    public void removeOrder(SubmenuOrder submenu, MainMenu mainMenu) {
        if (orderRep.getOrders().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_ORDERS.getText());
            submenu.runSubmenu(submenu, mainMenu);
        } else {

            int orderNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.ORDER_REMOVE.getText(),
                    orderRep.getOrders());

            if (orderNumber <= 0 || orderNumber > orderRep.getOrders().size()) {
                PrintToConsole.print(StandardPhrases.TO_MENU.getText());
                submenu.runSubmenu(submenu, mainMenu);
            }

            OrderService.removeOrder(orderRep, orderNumber);

        }
    }
}
