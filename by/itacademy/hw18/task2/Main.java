package by.itacademy.hw18.task2;

import java.lang.reflect.Method;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        doRequest("tryFindOne");
        doRequest("tryFindTwo");
        doRequest("tryFindThree");

    }

    public static void doRequest(String methodName) {
        try {
            Method method = Main.class.getMethod(methodName);
            if (method.isAnnotationPresent(AcademyInfo.class)) {

                System.out.printf("Annotation is presented for method - %s. Full name of annotation - %s\n",
                        method.getName(), method.getAnnotation(AcademyInfo.class).annotationType());

                System.out.printf("Value of annotation field - %s\n", method.getAnnotation(AcademyInfo.class).year());

            } else {

                System.out.printf("Annotation not found for method - %s\n", method.getName());

            }
        } catch (NoSuchMethodException | NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }


    @AcademyInfo(year = "2011")
    public static void tryFindOne() {
    }

    @AcademyInfo()
    public static void tryFindTwo() {
    }

    public static void tryFindThree() {
    }
}
