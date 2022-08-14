package by.itacademy.hw5.Task2;

public class Phone {

    String number;
    String model;
    int weight;

    //----------------------------------constructors-------------------------------------
    Phone() {

    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    //----------------------------------methods-----------------------------------
    void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public String getNumber() {

        return this.number;
    }

    void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println("Sending message to " + number);
        }
    }

    void receiveCall(String name, String phoneNumber) {
        System.out.println(name + " is calling. His (her) phone number is " + phoneNumber);
    }

}
