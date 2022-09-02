package by.itacademy.hw10.task1;

import java.util.HashSet;
import java.util.Set;

/*
Напишите методы union(Set<?> set1, Set<?> set2) и intersect(Set<?> set1, Set<?> set2), реализующих операции
объединения и пересечения множеств.
 */

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(5);
        set1.add(10);
        set1.add(17);

        set2.add(2);
        set2.add(17);
        set2.add(10);
        set2.add(5);


        System.out.println("Result of union: ");
        printSet(union(set1, set2));
        System.out.println("\nResult of intersection: ");
        printSet(intersect(set1,set2));
    }

    public static Set<Object> union(Set<?> set1,Set<?> set2) {
        Set<Object> unionSet = new HashSet<>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<Object> intersect(Set<?> set1, Set<?> set2) {
        Set<Object> intersectSet = new HashSet<>();
        for (Object element : set1) {
            for (Object element1 : set2) {
                if (element.equals(element1)) {
                    intersectSet.add(element);
                }
            }
        }
        return intersectSet;
    }

    public static void printSet(Set<Object> set) {
        if (set.size() != 0) {
            for (Object element : set) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
}
