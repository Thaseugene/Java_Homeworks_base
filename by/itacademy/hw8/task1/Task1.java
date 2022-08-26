package by.itacademy.hw8.task1;

public class Task1 {
    public static void main(String[] args) {
        /*Создать экземпляр класса Food */
        Food food = new Food();

        Cookable boil = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println(str);
            }
        };

        /*На вход метода prepare() передать экземпляр анонимного класса, расширяющего интерфейс Cookable*/
        food.prepare(boil, "Meat");
    }
}
