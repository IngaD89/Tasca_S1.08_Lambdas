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
        System.out.println("Ejercicio 1: imprimir todas las cadenas de texto que contienen letra 'o' ");
        String[] strings = {"catorce", "dos", "tres", "cuatro"};
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));

        return stringList
                .stream()
                .filter(word -> word.contains("o"))
                .toList();
    }

    private static List<String> filterByLetterAndLength() {
        System.out.println("Ejercicio 2: Imprimir palabras que contienen letra 'o' " +
                "y ademas tienen mas de 5 letras");
        String[] strings = {"catorce", "dos", "tres", "cuatro"};
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));

        return stringList
                .stream()
                .filter(word -> word.contains("o") && word.length() > 5)
                .toList();
    }
}