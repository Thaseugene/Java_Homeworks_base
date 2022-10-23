package by.itacademy.hw20.task1.entity.enums;

public enum CarType {

    SEDAN ("Sedan"),
    HATCHBACK ("Hatchback"),
    UNIVERSAL ("Universal"),
    SUV ("SUV"),
    CABRIOLET ("Cabriolet"),
    CUPE ("Cupe");

    public String carType;

    CarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }
}
