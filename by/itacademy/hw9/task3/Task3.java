package by.itacademy.hw9.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle(2,"Harley","V2 1.5L");
        Car car = new Car(4,"Chevrolet","V6");

        Garage garage = new Garage();
        int selection = 0;
        do {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            selection = scanner.nextInt();
            switch (selection) {
                case 1: printGarageList(garage.getGarageList());
                    break;
                case 2: {
                    if (garage.getGarageList().size() == 2) {
                        System.out.println("\nGarage is full\n");
                    } else if (garage.getGarageList().size() == 1 &&
                            garage.getGarageList().get(0).getClass() == Motorcycle.class) {
                                System.out.println("\nMotorcycle is already in garage\n");
                    } else {
                                garage.addVehicleInGarage(motorcycle);
                            }
                    break;
                }
                case 3: {
                    if (garage.getGarageList().size() == 2) {
                        System.out.println("\nGarage is full\n");
                    } else if (garage.getGarageList().size() == 1 &&
                            garage.getGarageList().get(0).getClass() == Car.class) {
                        System.out.println("\nCar is already in garage\n");
                    } else {
                        garage.addVehicleInGarage(car);
                    }
                    break;
                }
                case 4: {
                    if (garage.getGarageList().size() == 1 &&
                            garage.getGarageList().get(0).getClass() == Motorcycle.class) {
                        garage.removeMotorcycleFromGarage();
                    } else if (garage.getGarageList().size() == 2){
                        garage.removeMotorcycleFromGarage();
                    } else {
                        System.out.println("\nThere is no motorcycle in garage\n");
                    }
                    break;
                }
                case 5: {
                    if (garage.getGarageList().size() == 1 && garage.getGarageList().get(0).getClass() == Car.class) {
                        garage.removeCarFromGarage();
                    } else if (garage.getGarageList().size() == 2){
                        garage.removeCarFromGarage();
                    } else {
                        System.out.println("\nThere is no car in garage\n");
                    }
                    break;
                }
                case 6: {
                    if (garage.getGarageList().size() > 0) {
                        garage.removeCarFromGarage();
                        garage.removeMotorcycleFromGarage();
                    } else {
                        System.out.println("\nThere are no vehicles in garage\n");
                    }
                    break;
                }
                case 7: break;
                default:
                    System.out.println("The selection was invalid!");
            }
        } while (selection != 7);

    }
    public static void printGarageList(ArrayList<Vehicle> garageList) {
        if (garageList.isEmpty()) {
            System.out.println("\nGarage is empty\n");
        } else {
            System.out.println("\nNow in garage:");
            for (Vehicle vehicle : garageList) {
                System.out.println(String.format("%d. %s %s %s", garageList.indexOf(vehicle)+1,
                        vehicle.getClass().getSimpleName(), vehicle.getProducer(), vehicle.getEngine()));
            }
            System.out.println();
        }
    }
    public static void printMenu() {
        System.out.println("Enter number to choose menu:");
        System.out.println("[1] Show vehicles in garage");
        System.out.println("[2] Add motorcycle in garage");
        System.out.println("[3] Add car in garage");
        System.out.println("[4] Remove motorcycle from garage");
        System.out.println("[5] Remove car from garage");
        System.out.println("[6] Remove all vehicles from garage");
        System.out.println("[7] Quit");
        System.out.print("Insert selection: ");
    }
}
