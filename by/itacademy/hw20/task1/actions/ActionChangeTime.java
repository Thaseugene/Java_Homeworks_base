package by.itacademy.hw20.task1.actions;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.service.OrderService;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;

public class ActionChangeTime extends Action {
    private final OrderService orderService;

    public ActionChangeTime() {
        this.orderService = OrderService.getInstance();
    }

    @Override
    public void execute() {

        if (orderService.getOrderRepository().getOrders().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_ORDERS.getText());
        } else {
            int orderNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CHANGE_ORDER.getText(),
                    orderService.getOrderRepository().getOrders());
            if (orderNumber <= 0 || orderNumber > orderService.getOrderRepository().getOrders().size()) {
                PrintToConsole.print(StandardPhrases.TO_MENU.getText());
            } else {
                int orderTime = ConsoleScanAssistant.printAndScanInt(StandardPhrases.ORDER_NEW_TIME.getText());
                if (orderTime <= 0) {
                    PrintToConsole.print(StandardPhrases.TO_MENU.getText());
                } else {
                    orderService.changeOrderTime(orderNumber - 1, orderTime);
                }
            }
        }
    }
}

