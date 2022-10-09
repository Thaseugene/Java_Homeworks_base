package by.itacademy.hw20.console.main.submenu1;

import by.itacademy.hw20.console.main.MainMenu;
import by.itacademy.hw20.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.console.service.ListPrinter;
import by.itacademy.hw20.console.service.MenuPrinter;
import by.itacademy.hw20.console.service.PrintToConsole;
import by.itacademy.hw20.repositories.CarMasterRepository;
import by.itacademy.hw20.repositories.Garage;
import by.itacademy.hw20.repositories.OrderRepository;
import by.itacademy.hw20.repositories.UserRepository;
import by.itacademy.hw20.service.GarageService;
import by.itacademy.hw20.service.enums.StandardPhrases;

public class ActionRemoveCar {
    public void removeCar(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                          CarMasterRepository carMasterRep, SubmenuGarage submenuGarage, MainMenu mainMenu) {
        if (garage.getCarRepository().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_CARS.getText());
            submenuGarage.runSubmenu(printer, userRep, garage, orderRep, carMasterRep, submenuGarage, mainMenu);
        } else {

            int carNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CHOOSE_CAR.getText(),
                    garage.getCarRepository());
            if (carNumber <= 0 || carNumber > garage.getCarRepository().size()) {
                getBackToMenu(printer, userRep, garage, orderRep, carMasterRep, submenuGarage, mainMenu);
            } else {
                GarageService.removeCarFromGarage(garage, carNumber - 1);
            }
        }
    }

    private void getBackToMenu(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                               CarMasterRepository carMasterRep, SubmenuGarage submenuGarage, MainMenu mainMenu) {
        PrintToConsole.print(StandardPhrases.TO_MENU.getText());
        submenuGarage.runSubmenu(printer, userRep, garage, orderRep, carMasterRep, submenuGarage, mainMenu);
    }
}
