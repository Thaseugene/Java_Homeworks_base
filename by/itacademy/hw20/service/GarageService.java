package by.itacademy.hw20.service;

import by.itacademy.hw20.entity.Car;
import by.itacademy.hw20.repositories.Garage;

public class GarageService {

    public static void addCarToGarage(Garage garage, Car car) {
        garage.getCarRepository().add(car);
    }

    public static void removeCarFromGarage(Garage garage, int carNumber) {
        garage.getCarRepository().remove(carNumber);
    }
}
