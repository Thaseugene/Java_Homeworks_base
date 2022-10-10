package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.entity.Car;
import by.itacademy.hw20.task1.entity.CarMaster;
import by.itacademy.hw20.task1.entity.Order;
import by.itacademy.hw20.task1.repositories.OrderRepository;

public class OrderService {


    public static void addOrder(OrderRepository orderRepository, String number, int time, String status, Car car,
                                CarMaster carMaster) {
        orderRepository.getOrders().add(new Order(number, time, status, car, carMaster));
    }

    public static void changeOrderTime(OrderRepository orderRepository, int orderNumber, int orderTime) {
        orderRepository.getOrders().get(orderNumber).setOrderTime(orderTime);
    }

    public static void changeOrderStatus(OrderRepository orderRepository, int orderNumber, String orderStatus) {
        orderRepository.getOrders().get(orderNumber).setOrderStatus(orderStatus);
    }

    public static void removeOrder(OrderRepository orderRepository, int orderNumber) {
        orderRepository.getOrders().remove(orderNumber - 1);
    }
}
