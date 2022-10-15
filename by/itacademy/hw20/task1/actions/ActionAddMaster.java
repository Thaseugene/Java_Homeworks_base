package by.itacademy.hw20.task1.actions;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.entity.CarMaster;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;
import by.itacademy.hw20.task1.entity.enums.CarMasterType;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class ActionAddMaster extends Action {
    private final CarMasterRepository carMasterRep;

    public ActionAddMaster() {
        this.carMasterRep = CarMasterRepository.getInstance();
    }

    @Override
    public void execute() {

        CarMasterType type = null;
        AtomicInteger iterator = new AtomicInteger(1);

        String name = ConsoleScanAssistant.printAndScanLine(StandardPhrases.ENTER_M_NAME.getText());

        PrintToConsole.print(StandardPhrases.CHOOSE_TYP.getText());
        Arrays.stream(CarMasterType.class.getEnumConstants())
                .forEach(s -> System.out.printf("%s. %s\n", iterator.getAndIncrement(), s.getCarMasterType()));

        try {
            type = ((CarMasterType) (Array.get(CarMasterType.class.getEnumConstants(),
                    ConsoleScanAssistant.scanInt() - 1)));
        } catch (ArrayIndexOutOfBoundsException ignored) {
        }

        carMasterRep.getCarMasters().add(new CarMaster(name, type));
    }
}
