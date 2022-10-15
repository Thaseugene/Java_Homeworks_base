package by.itacademy.hw20.task1.actions;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.entity.Car;
import by.itacademy.hw20.task1.service.GarageService;
import by.itacademy.hw20.task1.entity.enums.CarType;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class ActionAddCar extends Action {
    private final GarageService garageService;

    public ActionAddCar() {
        this.garageService = GarageService.getInstance();
    }

    @Override
    public void execute() {

        CarType type = null;
        AtomicInteger iterator = new AtomicInteger(1);

        String number = ConsoleScanAssistant.printAndScanLine(StandardPhrases.ENTER_REG_NUM.getText());

        String producer = ConsoleScanAssistant.printAndScanLine(StandardPhrases.ENTER_PROD.getText());

        PrintToConsole.print(StandardPhrases.CHOOSE_TYP.getText());

        Arrays.stream(CarType.class.getEnumConstants())
                .forEach(s -> System.out.printf("%s. %s\n", iterator.getAndIncrement(), s.getCarType()));
        try {
            type = (CarType) (Array.get(CarType.class.getEnumConstants(), ConsoleScanAssistant.scanInt() - 1));
        } catch (ArrayIndexOutOfBoundsException ignored) {
        }

        garageService.addCarToGarage((new Car(number, producer, type)));
    }

}
