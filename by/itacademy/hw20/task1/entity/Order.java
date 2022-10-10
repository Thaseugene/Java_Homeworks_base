package by.itacademy.hw20.task1.entity;

public class Order {
    private String orderNumber;
    private int orderTime;
    private String orderStatus;
    private Car car;
    private CarMaster carMaster;

    public Order(String orderNumber, int orderTime, String orderStatus, Car car, CarMaster carMaster) {
        this.orderNumber = orderNumber;
        this.orderTime = orderTime;
        this.orderStatus = orderStatus;
        this.car = car;
        this.carMaster = carMaster;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(int orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public Car getOrderCar() {
        return car;
    }

    public CarMaster getOrderCarMaster() {
        return carMaster;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
