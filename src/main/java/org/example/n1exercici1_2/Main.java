package org.example.n1exercici1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(filterByLetter());
        System.out.println(filterByLetterAndLength());
    }

    private static List<String> filterByLetter() {
        String[] strings = {"uno", "dos", "tres", "cuatro"};
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));

        return stringList
                .stream()
                .filter(word -> word.contains("o"))
                .toList();
    }

    private static List<String> filterByLetterAndLength() {
        String[] strings = {"catorce", "dos", "tres", "cuatro"};
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));

        return stringList
                .stream()
                .filter(word -> word.contains("o") && word.length() > 5)
                .toList();
    }
}