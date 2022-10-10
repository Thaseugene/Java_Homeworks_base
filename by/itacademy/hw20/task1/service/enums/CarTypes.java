package by.itacademy.hw20.task1.service.enums;

public enum CarTypes {

    SEDAN ("Sedan"),
    HATCHBACK ("Hatchback"),
    UNIVERSAL ("Universal"),
    SUV ("SUV"),
    CABRIOLET ("Cabriolet"),
    CUPE ("Cupe");

    public String carType;

    CarTypes(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }
}
