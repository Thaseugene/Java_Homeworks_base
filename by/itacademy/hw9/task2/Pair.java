package by.itacademy.hw9.task2;

import java.util.ArrayList;
import java.util.Collections;

/*Реализовать класс Pair, который будет содержать 2 значения любого типа */
public class Pair {

    private final ArrayList<Object> elements = new ArrayList<>(2);

    public void addInitialElements(Object... element) {
        Collections.addAll(elements, element);
    }

    /*Класс должен уметь возвращать первый элемент*/
    public Object getFirstElement() {
        return elements.get(0);
    }

    /*второй элемент*/
    public Object getSecondElement() {
        return elements.get(1);
    }

    /*менять их местами*/
    public void swapElements() {
        Collections.swap(elements, 0, 1);
    }
    //Добавление нового элемента вместо первого
    public void addElementOnPosition(Object element, int index) {
        elements.remove(index);
        elements.add(index, element);
    }

}
