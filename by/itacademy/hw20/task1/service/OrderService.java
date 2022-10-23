package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.entity.Car;
import by.itacademy.hw20.task1.entity.CarMaster;
import by.itacademy.hw20.task1.entity.Order;
import by.itacademy.hw20.task1.entity.enums.OrderStatusType;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;
import by.itacademy.hw20.task1.repositories.Garage;
import by.itacademy.hw20.task1.repositories.OrderRepository;

public class OrderService {

    private static OrderService instance;
    private final OrderRepository orderRepository;


    public OrderService() {
        Garage garage = Garage.getInstance();
        CarMasterRepository carMasterRepository = CarMasterRepository.getInstance();
        this.orderRepository = OrderRepository.getInstance(garage, carMasterRepository);
    }

    public static OrderService getInstance() {
        if(instance == null) {
            instance = new OrderService();
        }
        return instance;
    }

    public void addOrder(String number, int time, OrderStatusType status, Car car,
                         CarMaster carMaster) {
        orderRepository.getOrders().add(new Order(number, time, status, car, carMaster));
    }

    public void changeOrderTime(int orderNumber, int orderTime) {
        orderRepository.getOrders().get(orderNumber).setOrderTime(orderTime);
    }

    public void changeOrderStatus(int orderNumber, OrderStatusType orderStatus) {
        orderRepository.getOrders().get(orderNumber).setOrderStatus(orderStatus);
    }

    public void removeOrder(int orderNumber) {
        orderRepository.getOrders().remove(orderNumber - 1);
    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }
}
