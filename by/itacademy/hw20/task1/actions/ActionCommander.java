package by.itacademy.hw20.task1.actions;

import by.itacademy.hw20.task1.actions.collectors.CarActionsCollector;
import by.itacademy.hw20.task1.actions.collectors.CarMasterActionsCollector;
import by.itacademy.hw20.task1.actions.collectors.LogInActionsCollector;
import by.itacademy.hw20.task1.actions.collectors.OrderActionsCollector;

public class ActionCommander {

    private static ActionCommander instance;
    private final CarActionsCollector carActionsCollector;
    private final CarMasterActionsCollector carMasterActionsCollector;
    private final LogInActionsCollector logInActionsCollector;
    private final OrderActionsCollector orderActionsCollector;

    private ActionCommander() {
        this.carActionsCollector = new CarActionsCollector(new ActionAddCar(), new ActionRemoveCar(),
                new ActionPrintCarList());
        this.carMasterActionsCollector = new CarMasterActionsCollector(new ActionAddMaster(), new ActionRemoveMaster(),
                new ActionPrintMasterList());
        this.logInActionsCollector = new LogInActionsCollector(new ActionLogIn(), new ActionRegister(),
                new ActionQuit());
        this.orderActionsCollector = new OrderActionsCollector(new ActionAddNewOrder(), new ActionRemoveOrder(),
                new ActionChangeOrderStatus(), new ActionChangeTime(), new ActionPrintOrderList());
    }

    public static ActionCommander getInstance() {
        if (instance == null) {
            instance = new ActionCommander();
        }
        return instance;
    }

    public CarActionsCollector getCarActionsCollector() {
        return carActionsCollector;
    }

    public CarMasterActionsCollector getCarMasterActionsCollector() {
        return carMasterActionsCollector;
    }

    public LogInActionsCollector getLogInActionsCollector() {
        return logInActionsCollector;
    }

    public OrderActionsCollector getOrderActionsCollector() {
        return orderActionsCollector;
    }
}
