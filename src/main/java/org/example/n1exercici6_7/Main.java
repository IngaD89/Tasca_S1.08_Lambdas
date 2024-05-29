package org.example.n1exercici6_7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        orderList();
        System.out.println();
        orderListReversed();
    }

    public static void orderList(){
        System.out.println("Ejercicio 6: ordenar strings de mas corto a mas largo");
        List<Object> objectList = Arrays.asList(23, 34, "Inga", "Demetrashvili");
        objectList
                .stream()
                .filter(obj -> obj instanceof String)
                .map(o -> (String) o)
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }

    public static void orderListReversed(){
        System.out.println("Ejercicio 7: ordenar strings de mas largo a mas corto");
        List<Object> objectList = Arrays.asList(23, 34, "Inga", "Demetrashvili");
        objectList
                .stream()
                .filter(obj -> obj instanceof String)
                .map(o -> (String) o)
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .forEach(System.out::println);
    }
}
