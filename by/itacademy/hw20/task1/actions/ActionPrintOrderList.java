package by.itacademy.hw20.task1.actions;

import by.itacademy.hw20.task1.console.service.ListPrinter;
import by.itacademy.hw20.task1.service.GarageService;
import by.itacademy.hw20.task1.service.OrderService;

public class ActionPrintOrderList extends Action {

    private OrderService orderService;

    public ActionPrintOrderList() {
        this.orderService = OrderService.getInstance();
    }

    @Override
    public void execute() {
        ListPrinter.printList(orderService.getOrderRepository().getOrders());
    }

}
