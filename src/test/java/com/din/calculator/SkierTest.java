package com.din.calculator;

import org.junit.Assert;
import org.junit.Test;

import static com.din.calculator.DinTable.FROM_271_TO_290;
import static com.din.calculator.DinTable.FROM_331_TO_350;
import static com.din.calculator.DinTable.UP_TO_230;

public class SkierTest {

    static final String BEGINNER = "BEGINNER";
    static final String INTERMEDIATE = "INTERMEDIATE";
    static final String ADVANCED = "ADVANCED";
    static final String YOUNGER_THAN_10 = "YOUNGER THAN 10";
    static final String BETWEEN_11_AND_50 = "BETWEEN 11 AND 50";
    static final String OLDER_THAN_50 = "OLDER THAN 50";


    @Test
    public void shouldCalculateDin() {
        //Given
        Skier skier = new Skier(BEGINNER, YOUNGER_THAN_10, "A", "H", UP_TO_230);
        //When
        double dinResult = skier.getDin();
        System.out.println(dinResult);
        //Then
        Assert.assertEquals(dinResult, 0.75, 0);
    }

    @Test
    public void shouldGetWeightRange() {
        //Given
        Skier skier1 = new Skier(BEGINNER, YOUNGER_THAN_10, "A", "H", UP_TO_230);
        Skier skier2 = new Skier(ADVANCED, BETWEEN_11_AND_50, "J", "K", FROM_331_TO_350);
        Skier skier3 = new Skier(INTERMEDIATE, BETWEEN_11_AND_50, "M", "L", FROM_331_TO_350);
        //When
        int weightRange1 = skier1.checkWeightRange(skier1.getWeightRange());
        int weightRange2 = skier2.checkWeightRange(skier2.getWeightRange());
        int weightRange3 = skier3.checkWeightRange(skier3.getWeightRange());
        //Then
        Assert.assertEquals(weightRange1, 1);
        Assert.assertEquals(weightRange2, 10);
        Assert.assertEquals(weightRange3, 13);
    }

    @Test
    public void shouldCalculateSkierCodeIncludingSkillLevelAndAge() {
        //Given
        Skier skier1 = new Skier(INTERMEDIATE, BETWEEN_11_AND_50, "L", "L", FROM_271_TO_290);
        //When
        int skier1Code = skier1.calculateSkierCodeIncludingSkillLevelAndAge();
        //Than
        Assert.assertEquals(skier1Code, 13);
    }

}