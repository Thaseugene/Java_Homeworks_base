package by.itacademy.hw20.task1.console.main.submenu2;

import by.itacademy.hw20.task1.console.main.MainMenu;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.MenuPrinter;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;
import by.itacademy.hw20.task1.repositories.Garage;
import by.itacademy.hw20.task1.repositories.OrderRepository;
import by.itacademy.hw20.task1.repositories.UserRepository;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

public class ActionRemoveMaster {
    private final CarMasterRepository carMasterRep;

    public ActionRemoveMaster(CarMasterRepository carMasterRep) {
        this.carMasterRep = carMasterRep;
    }
    public void removeMaster(SubmenuMaster submenu, MainMenu mainMenu) {
        if (carMasterRep.getCarMasters().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_MASTERS.getText());
            submenu.runSubmenu(submenu, mainMenu);
        } else {
            int selection = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CHOOSE_MASTER.getText(),
                    carMasterRep.getCarMasters());

            if (selection <= 0 || selection > carMasterRep.getCarMasters().size()) {
                getBackToMenu(submenu, mainMenu);
            } else {
                carMasterRep.getCarMasters().remove(selection - 1);
            }
        }

    }

    private void getBackToMenu(SubmenuMaster submenu, MainMenu mainMenu) {
        PrintToConsole.print(StandardPhrases.TO_MENU.getText());
        submenu.runSubmenu(submenu, mainMenu);
    }
}
