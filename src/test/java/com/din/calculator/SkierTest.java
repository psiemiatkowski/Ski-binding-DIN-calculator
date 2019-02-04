package com.din.calculator;

import org.junit.Assert;
import org.junit.Test;

public class SkierTest {
    static String BEGINNER = "BEGINNER";

    @Test
    public void souldCalulculateDin() {
        //Given
        Skier skier = new Skier(BEGINNER, "UP TO 10", "A", "H", "<=230");
        //When
        double dinResult = skier.calculateDin();
        //Then
        Assert.assertEquals(dinResult, 0.75, 0);
    }

}