package com.din.calculator;

import java.util.Map;

public class Skier {

    private String skillLevel;
    private String ageRange;
    private String weightRange;
    private String heightRange;
    private String shoeSizeRange;

    DinTable dinTable = new DinTable();

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
            case "A": {return 1;}
            case "B": {return 2;}
            case "C": {return 3;}
            case "D": {return 4;}
            case "E": {return 5;}
            case "F": {return 6;}
            case "G": {return 7;}
            case "H": {return 8;}
            case "I": {return 9;}
            case "J": {return 10;}
            case "K": {return 11;}
            case "L": {return 12;}
            case "M": {return 13;}
        }
        return 0;
    }

    public int checkHeightRange(String heightRange) {
        switch (heightRange) {
            case "H": {return 8;}
            case "I": {return 9;}
            case "J": {return 10;}
            case "K": {return 11;}
            case "L": {return 12;}
            case "M": {return 13;}
        }
        return 0;
    }

    public int calculateSkierCode() {
        return (Math.min(checkWeightRange(getWeightRange()), checkHeightRange(getHeightRange())));
    }

    public int checkSkillLevel(String skillLevel) {
        switch (skillLevel) {
            case "BEGINNER": {return 0;}
            case "INTERMEDIATE": {return 1;}
            case "ADVANCED": {return 2;}
        }
        return 0;
    }

    public int checkAgeRange(String ageRange) {
        switch (ageRange) {
            case "YOUNGER THAN 10": {return -1;}
            case "BETWEEN 11 AND 50": {return 0;}
            case "OLDER THAN 50": {return -1;}
        }
        return 0;
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
        try {
           return din.get(new Tuple(calculateSkierCodeIncludingSkillLevelAndAge(), getShoeSizeRange()));
        } catch (NullPointerException e) {
            System.out.println("Result beyond the DIN table. Check selected parameters.");
        }
        return 0.00;
    }
}
