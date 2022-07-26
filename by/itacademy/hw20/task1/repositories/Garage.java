package by.itacademy.hw20.task1.repositories;

import by.itacademy.hw20.task1.entity.enums.CarType;
import by.itacademy.hw20.task1.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private static Garage instance;
    private final List<Car> carRepository;

    private Garage() {
        carRepository = new ArrayList<>();
        init();
    }

    public static Garage getInstance() {
        if(instance == null) {
            instance = new Garage();
        }
        return instance;
    }

    public List<Car> getCarRepository() {
        return carRepository;
    }

    private void init() {
        carRepository.add(new Car("6603 CT-7", "BMW" , CarType.SEDAN));
        carRepository.add(new Car("2201 MP-7", "Mercedes", CarType.HATCHBACK));
        carRepository.add(new Car("3711 MM-7", "Volvo", CarType.SUV));
    }
}
