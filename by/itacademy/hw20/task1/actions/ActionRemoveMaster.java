package by.itacademy.hw20.task1.actions;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;

public class ActionRemoveMaster extends Action {
    private final CarMasterRepository carMasterRep;

    public ActionRemoveMaster() {
        this.carMasterRep = CarMasterRepository.getInstance();
    }

    @Override
    public void execute() {
        if (carMasterRep.getCarMasters().isEmpty()) {
            PrintToConsole.print(StandardPhrases.NO_MASTERS.getText());
        } else {
            int selection = ConsoleScanAssistant.printAndScanInt(StandardPhrases.CHOOSE_MASTER.getText(),
                    carMasterRep.getCarMasters());
            if (selection <= 0 || selection > carMasterRep.getCarMasters().size()) {
                PrintToConsole.print(StandardPhrases.TO_MENU.getText());
            } else {
                carMasterRep.getCarMasters().remove(selection - 1);
            }
        }

    }
}
