package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.entity.Car;
import by.itacademy.hw20.task1.repositories.Garage;

public class GarageService {
    private static GarageService instance;
    private final Garage garage;

    private GarageService() {
        this.garage = Garage.getInstance();
    }

    public static GarageService getInstance() {
        if(instance == null) {
            instance = new GarageService();
        }
        return instance;
    }

    public void addCarToGarage(Car car) {
        garage.getCarRepository().add(car);
    }

    public void removeCarFromGarage(int carNumber) {
        garage.getCarRepository().remove(carNumber);
    }

    public Garage getGarage() {
        return garage;
    }
}
