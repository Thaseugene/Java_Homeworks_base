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
import by.itacademy.hw20.task1.service.enums.OrderStatusTypes;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

public class ActionAddNewOrder {
    private final Garage garage;
    private final CarMasterRepository carMasterRep;
    private final OrderRepository orderRep;

    public ActionAddNewOrder(Garage garage, CarMasterRepository carMasterRep, OrderRepository orderRep) {
        this.garage = garage;
        this.carMasterRep = carMasterRep;
        this.orderRep = orderRep;
    }

    public void addNewOrder(SubmenuOrder submenu, MainMenu mainMenu) {

        if (carMasterRep.getCarMasters().isEmpty() || garage.getCarRepository().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_CARS_MASTERS.getText());
            submenu.runSubmenu(submenu, mainMenu);
        }

        String orderNumber = ConsoleScanAssistant.printAndScanLine(StandardPhrases.CRT_ORDER_NUM.getText());
        int orderTime = ConsoleScanAssistant.printAndScanInt(StandardPhrases.SET_TIME.getText());

        if (orderTime == 0) {
            getBackToMenu(submenu, mainMenu);
        }

        int carNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CH_CAR_REPAIR.getText(),
                garage.getCarRepository());

        if (carNumber <= 0 || carNumber > garage.getCarRepository().size()) {
            getBackToMenu(submenu, mainMenu);
        }

        int carMasterNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CH_MASTER_ORDER.getText(),
                carMasterRep.getCarMasters());

        if (carMasterNumber <= 0 || carMasterNumber > carMasterRep.getCarMasters().size()) {
            getBackToMenu(submenu, mainMenu);
        }

        OrderService.addOrder(orderRep, orderNumber, orderTime, OrderStatusTypes.NEW.getStatusType(),
                garage.getCarRepository().get(carNumber - 1), carMasterRep.getCarMasters().get(carMasterNumber - 1));
    }

    public void getBackToMenu(SubmenuOrder submenu, MainMenu mainMenu) {
        PrintToConsole.print(StandardPhrases.TO_MENU.getText());
        submenu.runSubmenu(submenu, mainMenu);
    }
}
