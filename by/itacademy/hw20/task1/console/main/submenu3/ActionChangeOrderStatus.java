package by.itacademy.hw20.task1.console.main.submenu3;

import by.itacademy.hw20.task1.console.main.MainMenu;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.OrderRepository;
import by.itacademy.hw20.task1.service.OrderService;
import by.itacademy.hw20.task1.service.enums.OrderStatusTypes;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class ActionChangeOrderStatus {
    private final OrderRepository orderRep;

    public ActionChangeOrderStatus(OrderRepository orderRep) {
        this.orderRep = orderRep;
    }

    public void changeStatus(SubmenuOrder submenu, MainMenu mainMenu) {

        if (orderRep.getOrders().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_ORDERS.getText());
            submenu.runSubmenu(submenu, mainMenu);
        } else {

            StringBuilder orderStatus = new StringBuilder();
            AtomicInteger iterator = new AtomicInteger(1);

            int orderNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CHANGE_ORDER.getText(),
                    orderRep.getOrders());
            if (orderNumber <= 0 || orderNumber > orderRep.getOrders().size()) {
                getBackToMenu(submenu, mainMenu);
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

    private void getBackToMenu(SubmenuOrder submenu, MainMenu mainMenu) {
        PrintToConsole.print(StandardPhrases.TO_MENU.getText());
        submenu.runSubmenu(submenu, mainMenu);
    }

}

