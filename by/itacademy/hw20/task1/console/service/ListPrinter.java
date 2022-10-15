package by.itacademy.hw20.task1.console.service;

import by.itacademy.hw20.task1.entity.Car;
import by.itacademy.hw20.task1.entity.CarMaster;
import by.itacademy.hw20.task1.entity.Order;

import java.util.List;

public class ListPrinter {

    public static void printList(List<?> list) {
        if (list.isEmpty()) {
            System.out.println("No elements in list");
        } else {
            for (Object object : list) {
                if (object instanceof Car) {
                    System.out.printf("%d. %s %s %s\n", list.indexOf((Car) object) + 1,
                            ((Car) object).getNumber(),
                            ((Car) object).getProducer(),
                            ((Car) object).getType().getCarType());
                } else if (object instanceof CarMaster) {
                    System.out.printf("%d. %s %s\n", list.indexOf((CarMaster) object) + 1,
                            ((CarMaster) object).getName(),
                            ((CarMaster) object).getMasterType().getCarMasterType());
                } else if (object instanceof Order) {
                    System.out.printf("%d. %s. Order status - %s. Duration time - %s days. Car - %s %s %s. " +
                                    "Master that connected to this order - %s.\n", list.indexOf((Order) object) + 1,
                            ((Order) object).getOrderNumber(),
                            ((Order) object).getOrderStatus().getStatusType(),
                            ((Order) object).getOrderTime(),
                            ((Order) object).getOrderCar().getNumber(),
                            ((Order) object).getOrderCar().getProducer(),
                            ((Order) object).getOrderCar().getType().getCarType(),
                            ((Order) object).getOrderCarMaster().getName());
                }
            }
        }
    }
}
