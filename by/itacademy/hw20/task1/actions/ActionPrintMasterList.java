package by.itacademy.hw20.task1.actions;

import by.itacademy.hw20.task1.console.service.ListPrinter;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;

public class ActionPrintMasterList extends Action {

    private CarMasterRepository carMasterRepository;

    public ActionPrintMasterList() {
        this.carMasterRepository = CarMasterRepository.getInstance();
    }

    @Override
    public void execute() {
        ListPrinter.printList(carMasterRepository.getCarMasters());
    }

}
