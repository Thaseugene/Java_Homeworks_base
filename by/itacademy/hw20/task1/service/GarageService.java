package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.entity.Car;
import by.itacademy.hw20.task1.repositories.Garage;

public class GarageService {

    public static void addCarToGarage(Garage garage, Car car) {
        garage.getCarRepository().add(car);
    }

    public static void removeCarFromGarage(Garage garage, int carNumber) {
        garage.getCarRepository().remove(carNumber);
    }
}
