package by.itacademy.hw20.task1.console.main.submenu3;

import by.itacademy.hw20.task1.console.main.MainMenu;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.ListPrinter;
import by.itacademy.hw20.task1.console.service.MenuPrinter;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;
import by.itacademy.hw20.task1.repositories.Garage;
import by.itacademy.hw20.task1.repositories.OrderRepository;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

public class SubmenuOrder {
    private final OrderRepository orderRep;
    private final MenuPrinter menuPrinter;

    private final ActionAddNewOrder actionAddNewOrder;
    private final ActionRemoveOrder actionRemoveOrder;
    private final ActionChangeOrderStatus actionChangeOrderStatus;
    private final ActionChangeTime actionChangeTime;

    public SubmenuOrder(Garage garage, CarMasterRepository carMasterRep, OrderRepository orderRep,
                        MenuPrinter menuPrinter) {
        this.orderRep = orderRep;
        this.menuPrinter = menuPrinter;
        this.actionAddNewOrder = new ActionAddNewOrder(garage, carMasterRep, orderRep);
        this.actionRemoveOrder = new ActionRemoveOrder(orderRep);
        this.actionChangeOrderStatus = new ActionChangeOrderStatus(orderRep);
        this.actionChangeTime = new ActionChangeTime(orderRep);
    }

    public void runSubmenu(SubmenuOrder submenu, MainMenu mainMenu) {

        int selection;
        do {
            menuPrinter.printSubmenu3();
            selection = ConsoleScanAssistant.scanInt();
            switch (selection) {
                case 1 -> actionAddNewOrder.addNewOrder(submenu, mainMenu);
                case 2 -> actionRemoveOrder.removeOrder(submenu, mainMenu);
                case 3 -> actionChangeOrderStatus.changeStatus(submenu, mainMenu);
                case 4 -> actionChangeTime.changeTime(submenu, mainMenu);
                case 5 -> ListPrinter.printList(orderRep.getOrders());
                case 6 -> mainMenu.runMenu(mainMenu);
                default -> PrintToConsole.print(StandardPhrases.TO_MENU.getText());
            }
        } while (selection != 6);
    }
}
