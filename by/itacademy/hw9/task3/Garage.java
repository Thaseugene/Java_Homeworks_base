package by.itacademy.hw9.task3;

import java.util.ArrayList;

public class Garage {

    private final ArrayList<Vehicle> garageList = new ArrayList<>(2);

    public void addVehicleInGarage (Vehicle vehicle) {
        garageList.add(vehicle);
    }

    public ArrayList<Vehicle> getGarageList() {
        return garageList;
    }

    public void removeVehicleFromGarage (Vehicle vehicle) {
        for (int i = 0; i < garageList.size(); i++) {
            if (garageList.get(i).getClass() == vehicle.getClass()) {
                garageList.remove(garageList.get(i));
            }
        }
    }

}
