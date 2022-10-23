package by.itacademy.hw20.task1.actions;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;
import by.itacademy.hw20.task1.repositories.Garage;
import by.itacademy.hw20.task1.service.OrderService;
import by.itacademy.hw20.task1.entity.enums.OrderStatusType;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;

public class ActionAddNewOrder extends Action {
    private final Garage garage;
    private final CarMasterRepository carMasterRep;
    private final OrderService orderService;

    public ActionAddNewOrder() {
        this.garage = Garage.getInstance();
        this.carMasterRep = CarMasterRepository.getInstance();
        this.orderService = OrderService.getInstance();
    }

    @Override
    public void execute() {

        if (carMasterRep.getCarMasters().isEmpty() || garage.getCarRepository().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_CARS_MASTERS.getText());
        } else {

            String orderNumber = ConsoleScanAssistant.printAndScanLine(StandardPhrases.CRT_ORDER_NUM.getText());
            int orderTime = ConsoleScanAssistant.printAndScanInt(StandardPhrases.SET_TIME.getText());

            if (orderTime == 0) {
                PrintToConsole.print(StandardPhrases.TO_MENU.getText());
            } else {

                int carNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CH_CAR_REPAIR.getText(),
                        garage.getCarRepository());

                if (carNumber <= 0 || carNumber > garage.getCarRepository().size()) {
                    PrintToConsole.print(StandardPhrases.TO_MENU.getText());
                } else {

                    int carMasterNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CH_MASTER_ORDER.getText(),
                            carMasterRep.getCarMasters());

                    if (carMasterNumber <= 0 || carMasterNumber > carMasterRep.getCarMasters().size()) {
                        PrintToConsole.print(StandardPhrases.TO_MENU.getText());
                    } else {

                        orderService.addOrder(orderNumber, orderTime, OrderStatusType.NEW,
                                garage.getCarRepository().get(carNumber - 1),
                                carMasterRep.getCarMasters().get(carMasterNumber - 1));
                    }
                }
            }
        }
    }

}
