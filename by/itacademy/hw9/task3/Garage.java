package by.itacademy.hw9.task3;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Vehicle> garageList;

    public Garage() {
        garageList = new ArrayList<>(2);
    }

    public void addVehicleInGarage (Vehicle vehicle) {
        garageList.add(vehicle);
    }

    public ArrayList<Vehicle> getGarageList() {
        return garageList;
    }

    public void removeMotorcycleFromGarage () {
        for (int i = 0; i < garageList.size(); i++) {
            if (garageList.get(i).getClass() == Motorcycle.class) {
                garageList.remove(garageList.get(i));
            }
        }
    }

        public void removeCarFromGarage () {
            for (int i = 0; i < garageList.size(); i++) {
                if (garageList.get(i).getClass() == Car.class) {
                    garageList.remove(garageList.get(i));
                }
            }
    }
}
