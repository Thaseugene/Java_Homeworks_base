package by.itacademy.hw18.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        Field[] fields = map.getClass().getDeclaredFields();
        Constructor<?>[] constructors = map.getClass().getDeclaredConstructors();
        Method[] methods = map.getClass().getDeclaredMethods();
        Class<?>[] classes = map.getClass().getDeclaredClasses();

        System.out.println("Fields:");
        Arrays.stream(fields).forEach(System.out::println);

        System.out.println("Constructors");
        Arrays.stream(constructors).forEach(System.out::println);

        System.out.println("Methods");
        Arrays.stream(methods).forEach(System.out::println);

        System.out.println("Inside classes:");
        Arrays.stream(classes).forEach(System.out::println);

        System.out.println("Parent class:");
        System.out.println(map.getClass().getSuperclass());
    }

}
