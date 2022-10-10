package by.itacademy.hw20.task1.console.main.submenu1;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.entity.Car;
import by.itacademy.hw20.task1.repositories.Garage;
import by.itacademy.hw20.task1.service.GarageService;
import by.itacademy.hw20.task1.service.enums.CarTypes;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class ActionAddCar {

    public void addCar(Garage garage) {

        StringBuilder type = new StringBuilder();
        AtomicInteger iterator = new AtomicInteger(1);

        String number = ConsoleScanAssistant.printAndScanLine(StandardPhrases.ENTER_REG_NUM.getText());

        String producer = ConsoleScanAssistant.printAndScanLine(StandardPhrases.ENTER_PROD.getText());

        PrintToConsole.print(StandardPhrases.CHOOSE_TYP.getText());

        Arrays.stream(CarTypes.class.getEnumConstants())
                .forEach(s -> System.out.printf("%s. %s\n", iterator.getAndIncrement(), s.getCarType()));
        try {
            type.append(((CarTypes)(Array.get(CarTypes.class.getEnumConstants(),
                    ConsoleScanAssistant.scanInt() - 1))).getCarType());
        } catch (ArrayIndexOutOfBoundsException ignored) {}

        GarageService.addCarToGarage(garage, (new Car(number,producer,type.toString())));
    }

}
