package by.itacademy.hw20.task1.actions;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.service.OrderService;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;

public class ActionRemoveOrder extends Action {
    private final OrderService orderService;

    public ActionRemoveOrder() {
        this.orderService = OrderService.getInstance();
    }

    public void execute() {
        if (orderService.getOrderRepository().getOrders().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_ORDERS.getText());
        } else {
            int orderNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.ORDER_REMOVE.getText(),
                    orderService.getOrderRepository().getOrders());
            if (orderNumber <= 0 || orderNumber > orderService.getOrderRepository().getOrders().size()) {
                PrintToConsole.print(StandardPhrases.TO_MENU.getText());
            } else {
                orderService.removeOrder(orderNumber);
            }
        }
    }
}
