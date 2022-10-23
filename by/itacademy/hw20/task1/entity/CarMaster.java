package by.itacademy.hw20.task1.entity;

import by.itacademy.hw20.task1.entity.enums.CarMasterType;

public class CarMaster {

    private String name;
    private CarMasterType masterType;

    public CarMaster(String name, CarMasterType masterType) {
        this.name = name;
        this.masterType = masterType;
    }

    public String getName() {
        return name;
    }

    public CarMasterType getMasterType() {
        return masterType;
    }
}
