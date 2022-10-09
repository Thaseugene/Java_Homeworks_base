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

public class ActionAddNewOrder {

    public void addNewOrder(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                            CarMasterRepository carMasterRep, SubmenuOrder submenu, MainMenu mainMenu) {

        if (carMasterRep.getCarMasters().isEmpty() || garage.getCarRepository().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_CARS_MASTERS.getText());
            submenu.runSubmenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
        }

        String orderNumber = ConsoleScanAssistant.printAndScanLine(StandardPhrases.CRT_ORDER_NUM.getText());
        int orderTime = ConsoleScanAssistant.printAndScanInt(StandardPhrases.SET_TIME.getText());

        if (orderTime == 0) {
            getBackToMenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
        }

        int carNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CH_CAR_REPAIR.getText(),
                garage.getCarRepository());

        if (carNumber <= 0 || carNumber > garage.getCarRepository().size()) {
            getBackToMenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
        }

        int carMasterNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CH_MASTER_ORDER.getText(),
                carMasterRep.getCarMasters());

        if (carMasterNumber <= 0 || carMasterNumber > carMasterRep.getCarMasters().size()) {
            getBackToMenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
        }

        OrderService.addOrder(orderRep, orderNumber, orderTime, OrderStatusTypes.NEW.getStatusType(),
                garage.getCarRepository().get(carNumber - 1), carMasterRep.getCarMasters().get(carMasterNumber - 1));
    }

    public void getBackToMenu(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                              CarMasterRepository carMasterRep, SubmenuOrder submenu, MainMenu mainMenu) {
        PrintToConsole.print(StandardPhrases.TO_MENU.getText());
        submenu.runSubmenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
    }
}
