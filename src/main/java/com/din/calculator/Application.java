package com.din.calculator;

public class Application {

    public static void main(String[] args) {

        Skier skier = new Skier("BEGINNER", "BETWEEN 11 - 50", "A", "H", "<=230");

        System.out.println(skier.calculateDin());



    }
}
