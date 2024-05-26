package org.example.n1exercici5;

public class Main {
    public static void main(String[] args) {

        PiValue piValue = () -> {
            System.out.println(3.14);
        };

        piValue.getPiValue();
    }
}
