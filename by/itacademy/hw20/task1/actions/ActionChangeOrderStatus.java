package by.itacademy.hw20.task1.actions;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.service.OrderService;
import by.itacademy.hw20.task1.entity.enums.OrderStatusType;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class ActionChangeOrderStatus extends Action {
    private final OrderService orderService;

    public ActionChangeOrderStatus() {
        this.orderService = OrderService.getInstance();
    }

    @Override
    public void execute() {

        if (orderService.getOrderRepository().getOrders().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_ORDERS.getText());
        } else {

            OrderStatusType orderStatus = null;
            AtomicInteger iterator = new AtomicInteger(1);

            int orderNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CHANGE_ORDER.getText(),
                    orderService.getOrderRepository().getOrders());
            if (orderNumber <= 0 || orderNumber > orderService.getOrderRepository().getOrders().size()) {
                PrintToConsole.print(StandardPhrases.TO_MENU.getText());
            } else {

                PrintToConsole.print(StandardPhrases.CHOOSE_STAT.getText());
                Arrays.stream(OrderStatusType.class.getEnumConstants())
                        .forEach(s -> System.out.printf("%s. %s\n", iterator.getAndIncrement(), s.getStatusType()));

                try {
                    orderStatus = (((OrderStatusType) (Array.get(OrderStatusType.class.getEnumConstants(),
                            ConsoleScanAssistant.scanInt() - 1))));
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
                orderService.changeOrderStatus(orderNumber - 1, orderStatus);
            }
        }
    }
}

