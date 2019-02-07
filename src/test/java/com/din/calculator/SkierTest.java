package com.din.calculator;

import org.junit.Assert;
import org.junit.Test;

import static com.din.calculator.DinTable.*;

public class SkierTest {

    static final String BEGINNER = "BEGINNER";
    static final String INTERMEDIATE = "INTERMEDIATE";
    static final String ADVANCED = "ADVANCED";

    static final String YOUNGER_THAN_10 = "YOUNGER THAN 10";
    static final String BETWEEN_11_AND_50 = "BETWEEN 11 AND 50";
    static final String OLDER_THAN_50 = "OLDER THAN 50";

    static final String W_FROM_10_TO_13 = "FROM 10 TO 13";
    static final String W_FROM_14_TO_17 = "FROM 14 TO 17";
    static final String W_FROM_18_TO_21 = "FROM 18 TO 21";
    static final String W_FROM_22_TO_25 = "FROM 22 TO 25";
    static final String W_FROM_26_TO_30 = "FROM 26 TO 30";
    static final String W_FROM_31_TO_35 = "FROM 31 TO 35";
    static final String W_FROM_36_TO_41 = "FROM 36 TO 41";
    static final String W_FROM_42_TO_48 = "FROM 42 TO 48";
    static final String W_FROM_49_TO_57 = "FROM 49 TO 57";
    static final String W_FROM_58_TO_66 = "FROM 58 TO 66";
    static final String W_FROM_67_TO_78 = "FROM 67 TO 78";
    static final String W_FROM_79_TO_94 = "FROM 79 TO 94";
    static final String W_ABOVE_95 = "ABOVE 95";

    static final String H_UP_TO_148 = "UP TO 148";
    static final String H_FROM_149_TO_157 = "FROM 149 TO 157";
    static final String H_FROM_158_TO_166 = "FROM 158 TO 166";
    static final String H_FROM_167_TO_178 = "FROM 167 TO 178";
    static final String H_FROM_179_TO_194 = "FROM 179 TO 194";
    static final String H_ABOVE_195 = "ABOVE 195";

    @Test
    public void shouldCalculateDin() {
        //Given
        Skier skier = new Skier(BEGINNER, YOUNGER_THAN_10, W_FROM_10_TO_13, H_UP_TO_148, S_FROM_231_TO_250);
        //When
        double dinResult = skier.calculateDin();
        //Then
        Assert.assertEquals(dinResult, 0.75, 0);
    }

    @Test
    public void shouldReturn0WhenResultIsBeyondTable() {
        //Given
        Skier skier1 = new Skier(BEGINNER, YOUNGER_THAN_10, W_FROM_14_TO_17, H_FROM_149_TO_157, S_FROM_331_TO_350);
        Skier skier2 = new Skier(ADVANCED, BETWEEN_11_AND_50, W_ABOVE_95, H_ABOVE_195, S_FROM_231_TO_250);
        //When
        double dinResult1 = skier1.calculateDin();
        double dinResult2 = skier2.calculateDin();
        //Then
        Assert.assertEquals(dinResult1, 0, 0);
        Assert.assertEquals(dinResult2, 0, 0);
    }

    @Test
    public void shouldGetWeightRange() {
        //Given
        Skier skier1 = new Skier(BEGINNER, YOUNGER_THAN_10, W_FROM_10_TO_13, H_UP_TO_148, S_UP_TO_230);
        Skier skier2 = new Skier(ADVANCED, BETWEEN_11_AND_50, W_FROM_58_TO_66, H_FROM_167_TO_178, S_FROM_331_TO_350);
        Skier skier3 = new Skier(INTERMEDIATE, OLDER_THAN_50, W_ABOVE_95, H_ABOVE_195, S_FROM_331_TO_350);
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
        Skier skier1 = new Skier(INTERMEDIATE, BETWEEN_11_AND_50, W_FROM_79_TO_94, H_FROM_179_TO_194, S_FROM_271_TO_290);
        //When
        int skier1Code = skier1.calculateSkierCodeIncludingSkillLevelAndAge();
        //Than
        Assert.assertEquals(skier1Code, 13);
    }

}