package by.itacademy.hw20.task1.actions;

import by.itacademy.hw20.task1.console.service.ListPrinter;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;
import by.itacademy.hw20.task1.service.GarageService;

public class ActionPrintCarList extends Action {

    private GarageService garageService;

    public ActionPrintCarList() {
        this.garageService = GarageService.getInstance();
    }

    @Override
    public void execute() {
        ListPrinter.printList(garageService.getGarage().getCarRepository());
    }

}
