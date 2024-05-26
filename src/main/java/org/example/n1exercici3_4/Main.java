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
