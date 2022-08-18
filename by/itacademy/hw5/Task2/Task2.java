package by.itacademy.hw5.Task2;

public class Task2 {

    public static void main(String[] args) {

        //-----------------------Create objects------------------------------------

        Phone phone = new Phone();
        phone.number = "+1234567890";
        phone.model = "Galaxy S8 plus";
        phone.weight = 350;

        Phone samsung = new Phone("+998877456", "Galaxy S22");

        Phone xiaomi = new Phone("+8745691320","Redmi 10", 320);


        //----------------------Using methods--------------------------------------

        phone.receiveCall("Grisha");

        //Using getter for number
        System.out.println("Your phone number is - " + xiaomi.getNumber());

        phone.sendMessage("+9876543210","+1237894560","+6549873210");

        samsung.receiveCall("Maria", "+7412589630");

    }
}
