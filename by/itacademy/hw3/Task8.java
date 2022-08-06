package by.itacademy.hw3;

public class Task8 {
    public static void main(String[] args) {

        int seconds = (int) (Math.random() * 28800);
        //output for developer Петровй
        System.out.println("Осталось " + seconds);

        int hours = (seconds - (seconds % 3600)) / 3600;

        //output for workers
        if (hours <= 8 && hours >= 5) {
            System.out.println("Осталось " + hours + " полных часов");
        } else if (hours <= 4 && hours >= 2) {
            System.out.println("Осталось " + hours + " полных часа");
        } else if (hours == 1) {
            System.out.println("Остался " + hours + " полный час");
        } else {
            System.out.println("Осталось меньше часа");
        }
    }
}
