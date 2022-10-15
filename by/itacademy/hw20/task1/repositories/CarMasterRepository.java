package by.itacademy.hw20.task1.repositories;

import by.itacademy.hw20.task1.entity.enums.CarMasterType;
import by.itacademy.hw20.task1.entity.CarMaster;

import java.util.ArrayList;
import java.util.List;

public class CarMasterRepository {

    private static CarMasterRepository instance;
    private List<CarMaster> carMasters;

    public CarMasterRepository() {
        carMasters = new ArrayList<>();
        init();
    }

    public static CarMasterRepository getInstance() {
        if(instance == null) {
            instance = new CarMasterRepository();
        }
        return instance;
    }

    public List<CarMaster> getCarMasters() {
        return carMasters;
    }

    public void init() {
        carMasters.add(new CarMaster("Johny", CarMasterType.ENGINE_MASTER));
        carMasters.add(new CarMaster("Alex", CarMasterType.SUSPENSION_MASTER));
        carMasters.add(new CarMaster("Kyle", CarMasterType.ELECTRICIAN));
    }
}
