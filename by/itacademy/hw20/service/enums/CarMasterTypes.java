package by.itacademy.hw20.service.enums;

public enum CarMasterTypes {
    ENGINE_MASTER ("engine master"),
    ELECTRICIAN ("electrician"),
    SUSPENSION_MASTER ("suspension master");


    public String carMasterType;

    CarMasterTypes(String carMasterType) {
        this.carMasterType = carMasterType;
    }

    public String getCarMasterType() {
        return carMasterType;
    }
}
