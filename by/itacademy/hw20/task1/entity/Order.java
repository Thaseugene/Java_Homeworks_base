package by.itacademy.hw20.task1.entity;

import by.itacademy.hw20.task1.entity.enums.OrderStatusType;

public class Order {
    private final String orderNumber;
    private int orderTime;
    private OrderStatusType orderStatus;
    private final Car car;
    private final CarMaster carMaster;

    public Order(String orderNumber, int orderTime, OrderStatusType orderStatus, Car car, CarMaster carMaster) {
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

    public OrderStatusType getOrderStatus() {
        return orderStatus;
    }

    public Car getOrderCar() {
        return car;
    }

    public CarMaster getOrderCarMaster() {
        return carMaster;
    }

    public void setOrderStatus(OrderStatusType orderStatus) {
        this.orderStatus = orderStatus;
    }
}
