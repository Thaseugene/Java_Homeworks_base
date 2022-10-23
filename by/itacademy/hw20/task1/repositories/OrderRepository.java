package by.itacademy.hw20.task1.repositories;

import by.itacademy.hw20.task1.entity.enums.OrderStatusType;
import by.itacademy.hw20.task1.entity.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private static OrderRepository instance;
    private final List<Order> orders;
    private final Garage garage;
    private final CarMasterRepository carMasterRep;

    private OrderRepository(Garage garage, CarMasterRepository carMasterRep) {
        this.orders = new ArrayList<>();
        this.garage = garage;
        this.carMasterRep = carMasterRep;
        init();
    }

    public static OrderRepository getInstance(Garage garage, CarMasterRepository carMasterRep) {
        if (instance == null) {
            instance = new OrderRepository(garage, carMasterRep);
        }
        return instance;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void init() {
        orders.add(new Order("000001", 3, OrderStatusType.IN_PROGRESS,
                garage.getCarRepository().get(0),  carMasterRep.getCarMasters().get(0)));
        orders.add(new Order("000002", 1, OrderStatusType.NEW,
                garage.getCarRepository().get(1),  carMasterRep.getCarMasters().get(1)));
        orders.add(new Order("000003", 3, OrderStatusType.CANCELED,
                garage.getCarRepository().get(2),  carMasterRep.getCarMasters().get(2)));
    }
}
