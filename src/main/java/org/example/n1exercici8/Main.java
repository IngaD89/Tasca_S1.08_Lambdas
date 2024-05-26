package org.example.n1exercici8;

public class Main {
    public static void main(String[] args) {

        Reverse reverse = (s) -> {
           return String.valueOf(new StringBuilder(s).reverse());
        };

        String originalWord = "Hola";
        String reversedWord = reverse.reverse(originalWord);

        System.out.println("Original: " + originalWord);
        System.out.println("Reversed: " + reversedWord);
    }
}
