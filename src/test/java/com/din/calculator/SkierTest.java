package com.din.calculator;

import org.junit.Assert;
import org.junit.Test;

import static com.din.calculator.Constants.*;

public class SkierTest {

    @Test
    public void shouldReturnCorrectWeightRange() {
        //Given
        Skier skier1 = new Skier(BEGINNER, YOUNGER_THAN_10, W_FROM_10_TO_13, H_UP_TO_148, S_UP_TO_230);
        Skier skier2 = new Skier(ADVANCED, BETWEEN_11_AND_50, W_FROM_58_TO_66, H_FROM_167_TO_178, S_FROM_331_TO_350);
        Skier skier3 = new Skier(INTERMEDIATE, OLDER_THAN_50, W_ABOVE_94, H_ABOVE_194, S_FROM_331_TO_350);
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
    public void shouldReturnCorrectHeightRange() {
        //Given
        Skier skier1 = new Skier(BEGINNER, YOUNGER_THAN_10, W_FROM_10_TO_13, H_UP_TO_148, S_UP_TO_230);
        Skier skier2 = new Skier(ADVANCED, BETWEEN_11_AND_50, W_FROM_58_TO_66, H_FROM_167_TO_178, S_FROM_331_TO_350);
        Skier skier3 = new Skier(INTERMEDIATE, OLDER_THAN_50, W_ABOVE_94, H_ABOVE_194, S_FROM_331_TO_350);
        //When
        int heightRange1 = skier1.checkHeightRange(skier1.getHeightRange());
        int heightRange2 = skier2.checkHeightRange(skier2.getHeightRange());
        int heightRange3 = skier3.checkHeightRange(skier3.getHeightRange());
        //Then
        Assert.assertEquals(heightRange1, 8);
        Assert.assertEquals(heightRange2, 11);
        Assert.assertEquals(heightRange3, 13);
    }

    @Test
    public void shouldCalculateSkierCode() {
        //Given
        Skier skier1 = new Skier(INTERMEDIATE, BETWEEN_11_AND_50, W_FROM_18_TO_21, H_UP_TO_148, S_FROM_231_TO_250);
        Skier skier2 = new Skier(ADVANCED, BETWEEN_11_AND_50, W_FROM_58_TO_66, H_FROM_149_TO_157, S_FROM_251_TO_270);
        Skier skier3 = new Skier(BEGINNER, OLDER_THAN_50, W_ABOVE_94, H_ABOVE_194, S_ABOVE_350);
        Skier skier4 = new Skier(INTERMEDIATE, YOUNGER_THAN_10, W_FROM_10_TO_13, H_UP_TO_148, S_UP_TO_230);
        //When
        int skierCode1 = skier1.calculateSkierCode();
        int skierCode2 = skier2.calculateSkierCode();
        int skierCode3 = skier3.calculateSkierCode();
        int skierCode4 = skier4.calculateSkierCode();
        //Then
        Assert.assertEquals(skierCode1, 3);
        Assert.assertEquals(skierCode2, 9);
        Assert.assertEquals(skierCode3, 13);
        Assert.assertEquals(skierCode4, 1);
    }

    @Test
    public void shouldReturnCorrectSkillLevel() {
        //Given
        Skier skier1 = new Skier(INTERMEDIATE, BETWEEN_11_AND_50, W_FROM_18_TO_21, H_UP_TO_148, S_FROM_231_TO_250);
        Skier skier2 = new Skier(ADVANCED, BETWEEN_11_AND_50, W_FROM_58_TO_66, H_FROM_149_TO_157, S_FROM_251_TO_270);
        Skier skier3 = new Skier(BEGINNER, OLDER_THAN_50, W_ABOVE_94, H_ABOVE_194, S_ABOVE_350);
        //When
        int skierSkillLevel1 = skier1.checkSkillLevel(skier1.getSkillLevel());
        int skierSkillLevel2 = skier1.checkSkillLevel(skier2.getSkillLevel());
        int skierSkillLevel3 = skier1.checkSkillLevel(skier3.getSkillLevel());
        //Then
        Assert.assertEquals(skierSkillLevel1, 1);
        Assert.assertEquals(skierSkillLevel2, 2);
        Assert.assertEquals(skierSkillLevel3, 0);
    }

    @Test
    public void shouldReturnCorrectAgeRange() {
        //Given
        Skier skier1 = new Skier(BEGINNER, YOUNGER_THAN_10, W_FROM_10_TO_13, H_UP_TO_148, S_UP_TO_230);
        Skier skier2 = new Skier(ADVANCED, BETWEEN_11_AND_50, W_FROM_58_TO_66, H_FROM_149_TO_157, S_FROM_251_TO_270);
        Skier skier3 = new Skier(INTERMEDIATE, OLDER_THAN_50, W_FROM_79_TO_94, H_FROM_179_TO_194, S_FROM_271_TO_290);
        //When
        int skierAgeRange1 = skier1.checkAgeRange(skier1.getAgeRange());
        int skierAgeRange2 = skier2.checkAgeRange(skier2.getAgeRange());
        int skierAgeRange3 = skier3.checkAgeRange(skier3.getAgeRange());
        //Then
        Assert.assertEquals(skierAgeRange1, -1);
        Assert.assertEquals(skierAgeRange2, 0);
        Assert.assertEquals(skierAgeRange3, -1);
    }

    @Test
    public void shouldCalculateSkierCodeIncludingSkillLevelAndAge() {
        //Given
        Skier skier1 = new Skier(INTERMEDIATE, BETWEEN_11_AND_50, W_FROM_79_TO_94, H_FROM_179_TO_194, S_FROM_271_TO_290);
        Skier skier2 = new Skier(ADVANCED, BETWEEN_11_AND_50, W_FROM_58_TO_66, H_FROM_167_TO_178, S_FROM_251_TO_270);
        Skier skier3 = new Skier(BEGINNER, OLDER_THAN_50, W_ABOVE_94, H_ABOVE_194, S_FROM_331_TO_350);
        Skier skier4 = new Skier(BEGINNER, YOUNGER_THAN_10, W_FROM_10_TO_13, H_UP_TO_148, S_UP_TO_230);
        Skier skier5 = new Skier(INTERMEDIATE, OLDER_THAN_50, W_FROM_67_TO_78, H_FROM_179_TO_194, S_FROM_271_TO_290);
        Skier skier6 = new Skier(ADVANCED, BETWEEN_11_AND_50, W_FROM_26_TO_30, H_UP_TO_148, S_FROM_231_TO_250);
        //When
        int skierCodeIncludingSkillLevelAndAge1 = skier1.calculateSkierCodeIncludingSkillLevelAndAge();
        int skierCodeIncludingSkillLevelAndAge2 = skier2.calculateSkierCodeIncludingSkillLevelAndAge();
        int skierCodeIncludingSkillLevelAndAge3 = skier3.calculateSkierCodeIncludingSkillLevelAndAge();
        int skierCodeIncludingSkillLevelAndAge4 = skier4.calculateSkierCodeIncludingSkillLevelAndAge();
        int skierCodeIncludingSkillLevelAndAge5 = skier5.calculateSkierCodeIncludingSkillLevelAndAge();
        int skierCodeIncludingSkillLevelAndAge6 = skier6.calculateSkierCodeIncludingSkillLevelAndAge();
        //Than
        Assert.assertEquals(skierCodeIncludingSkillLevelAndAge1, 13);
        Assert.assertEquals(skierCodeIncludingSkillLevelAndAge2, 12);
        Assert.assertEquals(skierCodeIncludingSkillLevelAndAge3, 12);
        Assert.assertEquals(skierCodeIncludingSkillLevelAndAge4, 1);
        Assert.assertEquals(skierCodeIncludingSkillLevelAndAge5, 11);
        Assert.assertEquals(skierCodeIncludingSkillLevelAndAge6, 7);
    }

    @Test
    public void shouldCalculateDin() {
        //Given
        Skier skier1 = new Skier(BEGINNER, YOUNGER_THAN_10, W_FROM_10_TO_13, H_UP_TO_148, S_UP_TO_230);
        Skier skier2 = new Skier(ADVANCED, BETWEEN_11_AND_50, W_FROM_58_TO_66, H_FROM_149_TO_157, S_FROM_251_TO_270);
        Skier skier3 = new Skier(INTERMEDIATE, OLDER_THAN_50, W_FROM_79_TO_94, H_FROM_179_TO_194, S_FROM_271_TO_290);
        Skier skier4 = new Skier(ADVANCED, BETWEEN_11_AND_50, W_FROM_42_TO_48, H_FROM_149_TO_157, S_FROM_271_TO_290);
        Skier skier5 = new Skier(INTERMEDIATE, OLDER_THAN_50, W_ABOVE_94, H_ABOVE_194, S_ABOVE_350);
        Skier skier6 = new Skier(BEGINNER, BETWEEN_11_AND_50, W_FROM_26_TO_30, H_UP_TO_148, S_FROM_311_TO_330);
        //When
        double dinResult1 = skier1.calculateDin();
        double dinResult2 = skier2.calculateDin();
        double dinResult3 = skier3.calculateDin();
        double dinResult4 = skier4.calculateDin();
        double dinResult5 = skier5.calculateDin();
        double dinResult6 = skier6.calculateDin();
        //Then
        Assert.assertEquals(dinResult1, 0.75, 0);
        Assert.assertEquals(dinResult2, 6.5, 0);
        Assert.assertEquals(dinResult3, 7, 0);
        Assert.assertEquals(dinResult4, 5, 0);
        Assert.assertEquals(dinResult5, 6, 0);
        Assert.assertEquals(dinResult6, 1.5, 0);
    }

    @Test
    public void shouldReturn0WhenDinResultIsBeyondTable() {
        //Given
        Skier skier1 = new Skier(BEGINNER, YOUNGER_THAN_10, W_FROM_14_TO_17, H_FROM_149_TO_157, S_FROM_331_TO_350);
        Skier skier2 = new Skier(ADVANCED, BETWEEN_11_AND_50, W_ABOVE_94, H_ABOVE_194, S_FROM_231_TO_250);
        Skier skier3 = new Skier(INTERMEDIATE, BETWEEN_11_AND_50, W_FROM_42_TO_48, H_UP_TO_148, S_ABOVE_350);
        Skier skier4 = new Skier(BEGINNER, OLDER_THAN_50, W_FROM_67_TO_78, H_FROM_179_TO_194, S_FROM_231_TO_250);
        //When
        double dinResult1 = skier1.calculateDin();
        double dinResult2 = skier2.calculateDin();
        double dinResult3 = skier3.calculateDin();
        double dinResult4 = skier4.calculateDin();
        //Then
        Assert.assertEquals(dinResult1, 0, 0);
        Assert.assertEquals(dinResult2, 0, 0);
        Assert.assertEquals(dinResult3, 0, 0);
        Assert.assertEquals(dinResult4, 0, 0);
    }
}
