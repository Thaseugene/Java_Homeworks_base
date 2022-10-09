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
import by.itacademy.hw20.service.enums.OrderStatusTypes;
import by.itacademy.hw20.service.enums.StandardPhrases;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class ActionChangeOrderStatus {

    public void changeStatus(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                             CarMasterRepository carMasterRep, SubmenuOrder submenu, MainMenu mainMenu) {

        if (orderRep.getOrders().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_ORDERS.getText());
            submenu.runSubmenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
        } else {

            StringBuilder orderStatus = new StringBuilder();
            AtomicInteger iterator = new AtomicInteger(1);

            int orderNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CHANGE_ORDER.getText(),
                    orderRep.getOrders());
            if (orderNumber <= 0 || orderNumber > orderRep.getOrders().size()) {
                getBackToMenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
            }

            PrintToConsole.print(StandardPhrases.CHOOSE_STAT.getText());
            Arrays.stream(OrderStatusTypes.class.getEnumConstants())
                    .forEach(s -> System.out.printf("%s. %s\n", iterator.getAndIncrement(), s.getStatusType()));

            try {
                orderStatus.append(((OrderStatusTypes) (Array.get(OrderStatusTypes.class.getEnumConstants(),
                        ConsoleScanAssistant.scanInt() - 1))).getStatusType());
            } catch (ArrayIndexOutOfBoundsException ignored) {
            }

            OrderService.changeOrderStatus(orderRep, orderNumber - 1, orderStatus.toString());
        }
    }

    private void getBackToMenu(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                               CarMasterRepository carMasterRep, SubmenuOrder submenu, MainMenu mainMenu) {
        PrintToConsole.print(StandardPhrases.TO_MENU.getText());
        submenu.runSubmenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
    }

}

