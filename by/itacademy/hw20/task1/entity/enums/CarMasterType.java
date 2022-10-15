package by.itacademy.hw20.task1.entity.enums;

public enum CarMasterType {
    ENGINE_MASTER ("engine master"),
    ELECTRICIAN ("electrician"),
    SUSPENSION_MASTER ("suspension master");


    public String carMasterType;

    CarMasterType(String carMasterType) {
        this.carMasterType = carMasterType;
    }

    public String getCarMasterType() {
        return carMasterType;
    }
}
