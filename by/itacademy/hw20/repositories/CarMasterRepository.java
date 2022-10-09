package by.itacademy.hw20.repositories;

import by.itacademy.hw20.service.enums.CarMasterTypes;
import by.itacademy.hw20.entity.CarMaster;

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
        carMasters.add(new CarMaster("Johny", CarMasterTypes.ENGINE_MASTER.getCarMasterType()));
        carMasters.add(new CarMaster("Alex", CarMasterTypes.SUSPENSION_MASTER.getCarMasterType()));
        carMasters.add(new CarMaster("Kyle", CarMasterTypes.ELECTRICIAN.getCarMasterType()));
    }
}
