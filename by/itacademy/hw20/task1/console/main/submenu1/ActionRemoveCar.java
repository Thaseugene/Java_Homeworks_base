package by.itacademy.hw20.task1.console.main.submenu1;

import by.itacademy.hw20.task1.console.main.MainMenu;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.Garage;
import by.itacademy.hw20.task1.service.GarageService;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

public class ActionRemoveCar {
    private final Garage garage;

    public ActionRemoveCar(Garage garage) {
        this.garage = garage;
    }

    public void removeCar(SubmenuGarage submenuGarage, MainMenu mainMenu) {
        if (garage.getCarRepository().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_CARS.getText());
            submenuGarage.runSubmenu(submenuGarage, mainMenu);
        } else {

            int carNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CHOOSE_CAR.getText(),
                    garage.getCarRepository());
            if (carNumber <= 0 || carNumber > garage.getCarRepository().size()) {
                getBackToMenu(submenuGarage, mainMenu);
            } else {
                GarageService.removeCarFromGarage(garage, carNumber - 1);
            }
        }
    }

    private void getBackToMenu(SubmenuGarage submenuGarage, MainMenu mainMenu) {
        PrintToConsole.print(StandardPhrases.TO_MENU.getText());
        submenuGarage.runSubmenu(submenuGarage, mainMenu);
    }
}