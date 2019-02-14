package com.din.calculator;

import static com.din.calculator.Constants.*;

public class Application {

    public static void main(String[] args) {

        Skier skier = new Skier(INTERMEDIATE, BETWEEN_11_AND_50, W_FROM_79_TO_94, H_FROM_179_TO_194, S_FROM_271_TO_290);
        System.out.println("DIN result: " + skier.calculateDin());
    }
}
