package by.itacademy.hw9.task2;

public class Task2 {
    public static void main(String[] args) {

        //Добавление элементов
        Pair pair = new Pair();
        pair.addInitialElements("Suzuki", 21);

        //Вывод элементов
        System.out.println(pair.getFirstElement().toString());
        System.out.println(pair.getSecondElement().toString()+"\n");

        //Смена мест элементов
        pair.swapElements();

        //Вывод элементов
        System.out.println(pair.getFirstElement().toString());
        System.out.println(pair.getSecondElement().toString()+"\n");

        //Замена первого элемента на новый
        pair.addElementOnPosition("Mercedes",0);

        //Вывод первого элемента
        System.out.println(pair.getFirstElement().toString());

        //Замена второго элемента на новый
        pair.addElementOnPosition(5.5,1);

        //Вывод второго элемента
        System.out.println(pair.getSecondElement().toString());
    }

}
