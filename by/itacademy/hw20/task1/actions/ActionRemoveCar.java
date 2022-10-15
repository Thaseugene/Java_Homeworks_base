package by.itacademy.hw20.task1.actions;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.service.GarageService;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;

public class ActionRemoveCar extends Action {
    private final GarageService garageService;

    public ActionRemoveCar() {
        this.garageService = GarageService.getInstance();
    }

    @Override
    public void execute() {
        if (garageService.getGarage().getCarRepository().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_CARS.getText());
        } else {
            int carNumber = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CHOOSE_CAR.getText(),
                    garageService.getGarage().getCarRepository());
            if (carNumber <= 0 || carNumber > garageService.getGarage().getCarRepository().size()) {
                PrintToConsole.print(StandardPhrases.TO_MENU.getText());
            } else {
                garageService.removeCarFromGarage(carNumber - 1);

            }
        }
    }
}
