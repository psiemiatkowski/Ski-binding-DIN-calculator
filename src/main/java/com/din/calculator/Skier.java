package com.din.calculator;

import java.util.Map;

import static com.din.calculator.Constants.*;

public class Skier {

    private String skillLevel;
    private String ageRange;
    private String weightRange;
    private String heightRange;
    private String shoeSizeRange;

    private DinTable dinTable = new DinTable();

    public Skier(String skillLevel, String ageRange, String weightRange, String heightRange, String shoeSizeRange) {
        this.skillLevel = skillLevel;
        this.ageRange = ageRange;
        this.weightRange = weightRange;
        this.heightRange = heightRange;
        this.shoeSizeRange = shoeSizeRange;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public String getWeightRange() {
        return weightRange;
    }

    public String getHeightRange() {
        return heightRange;
    }

    public String getShoeSizeRange() {
        return shoeSizeRange;
    }

    public int checkWeightRange(String weightRange) {
        switch (weightRange) {
            case W_FROM_10_TO_13: {return 1;}
            case W_FROM_14_TO_17: {return 2;}
            case W_FROM_18_TO_21: {return 3;}
            case W_FROM_22_TO_25: {return 4;}
            case W_FROM_26_TO_30: {return 5;}
            case W_FROM_31_TO_35: {return 6;}
            case W_FROM_36_TO_41: {return 7;}
            case W_FROM_42_TO_48: {return 8;}
            case W_FROM_49_TO_57: {return 9;}
            case W_FROM_58_TO_66: {return 10;}
            case W_FROM_67_TO_78: {return 11;}
            case W_FROM_79_TO_94: {return 12;}
            case W_ABOVE_95: {return 13;}
        }
        return 100;
    }

    public int checkHeightRange(String heightRange) {
        switch (heightRange) {
            case H_UP_TO_148: {return 8;}
            case H_FROM_149_TO_157: {return 9;}
            case H_FROM_158_TO_166: {return 10;}
            case H_FROM_167_TO_178: {return 11;}
            case H_FROM_179_TO_194: {return 12;}
            case H_ABOVE_195: {return 13;}
        }
        return 100;
    }

    public int calculateSkierCode() {
        if (checkWeightRange(getWeightRange()) > 13 || checkHeightRange(getHeightRange()) > 13) {
            System.out.println("Incorrect weight or height parameter");
        }
        return (Math.min(checkWeightRange(getWeightRange()), checkHeightRange(getHeightRange())));
    }

    public int checkSkillLevel(String skillLevel) {
        switch (skillLevel) {
            case BEGINNER: {return 0;}
            case INTERMEDIATE: {return 1;}
            case ADVANCED: {return 2;}
        }
        return 100;
    }

    public int checkAgeRange(String ageRange) {
        switch (ageRange) {
            case YOUNGER_THAN_10: {return -1;}
            case BETWEEN_11_AND_50: {return 0;}
            case OLDER_THAN_50: {return -1;}
        }
        return 100;
    }

    public int calculateSkierCodeIncludingSkillLevelAndAge() {
        int skierCode = calculateSkierCode() + checkSkillLevel(getSkillLevel()) + checkAgeRange(getAgeRange());
        if (skierCode < 1) {
            skierCode = 1;
        }
        return skierCode;
    }

    public double calculateDin() {
        Map<Tuple, Double> din = dinTable.getDinTable();
        Double result = din.get(new Tuple(calculateSkierCodeIncludingSkillLevelAndAge(), getShoeSizeRange()));
        if (result == null) {
            System.out.println("Result beyond the DIN table. Check selected parameters.");
            return 0;
        }
        return result;
    }
 }
