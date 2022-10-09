package by.itacademy.hw20.console.main.submenu2;

import by.itacademy.hw20.console.main.MainMenu;
import by.itacademy.hw20.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.console.service.ListPrinter;
import by.itacademy.hw20.console.service.MenuPrinter;
import by.itacademy.hw20.console.service.PrintToConsole;
import by.itacademy.hw20.repositories.CarMasterRepository;
import by.itacademy.hw20.repositories.Garage;
import by.itacademy.hw20.repositories.OrderRepository;
import by.itacademy.hw20.repositories.UserRepository;
import by.itacademy.hw20.service.enums.StandardPhrases;

public class ActionRemoveMaster {

    public void removeMaster(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                             CarMasterRepository carMasterRep, SubmenuMaster submenu, MainMenu mainMenu) {
        if (carMasterRep.getCarMasters().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_MASTERS.getText());
            submenu.runSubmenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
        } else {
            int selection = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CHOOSE_MASTER.getText(),
                    carMasterRep.getCarMasters());

            if (selection <= 0 || selection > carMasterRep.getCarMasters().size()) {
                getBackToMenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
            } else {
                carMasterRep.getCarMasters().remove(selection - 1);
            }
        }

    }

    private void getBackToMenu(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                               CarMasterRepository carMasterRep, SubmenuMaster submenu, MainMenu mainMenu) {
        PrintToConsole.print(StandardPhrases.TO_MENU.getText());
        submenu.runSubmenu(printer, userRep, garage, orderRep, carMasterRep, submenu, mainMenu);
    }
}
