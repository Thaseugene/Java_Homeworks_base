package by.itacademy.hw20.console.main.submenu2;

import by.itacademy.hw20.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.console.service.PrintToConsole;
import by.itacademy.hw20.entity.CarMaster;
import by.itacademy.hw20.repositories.CarMasterRepository;
import by.itacademy.hw20.service.enums.CarMasterTypes;
import by.itacademy.hw20.service.enums.StandardPhrases;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class ActionAddMaster {
    public void addMaster(CarMasterRepository carMasterRep) {

        StringBuilder type = new StringBuilder();
        AtomicInteger iterator = new AtomicInteger(1);

        String name = ConsoleScanAssistant.printAndScanLine(StandardPhrases.ENTER_M_NAME.getText());

        PrintToConsole.print(StandardPhrases.CHOOSE_TYP.getText());
        Arrays.stream(CarMasterTypes.class.getEnumConstants())
                .forEach(s -> System.out.printf("%s. %s\n", iterator.getAndIncrement(), s.getCarMasterType()));
        try {
            type.append(((CarMasterTypes) (Array.get(CarMasterTypes.class.getEnumConstants(),
                    ConsoleScanAssistant.scanInt() - 1))).getCarMasterType());
        } catch (ArrayIndexOutOfBoundsException ignored) {
        }

        carMasterRep.getCarMasters().add(new CarMaster(name, type.toString()));
    }
}
