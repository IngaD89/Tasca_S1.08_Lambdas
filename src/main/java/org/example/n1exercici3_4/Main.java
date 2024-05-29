package org.example.n1exercici3_4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        printMonth();
        System.out.println();
        printMonthWithReference();

    }

    public static void printMonth(){
        System.out.println("Ejercicio 3: imprimir meses mediante lambda");
        String[] months = new String[]{
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        List<String> monthList = Arrays.asList(months);
        monthList
                .forEach(month -> System.out.println(month));
    }

    public static void printMonthWithReference(){
        System.out.println("Ejercicio 4: imrimir meses mediante lambda method reference");
        String[] months = new String[]{
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        List<String> monthList = Arrays.asList(months);
        monthList
                .forEach(System.out::println);
    }
}
