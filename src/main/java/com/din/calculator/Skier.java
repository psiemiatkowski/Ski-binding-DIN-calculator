package com.din.calculator;

import java.util.Map;

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
            case "FROM 10 TO 13": {return 1;}
            case "FROM 14 TO 17": {return 2;}
            case "FROM 18 TO 21": {return 3;}
            case "FROM 22 TO 25": {return 4;}
            case "FROM 26 TO 30": {return 5;}
            case "FROM 31 TO 35": {return 6;}
            case "FROM 36 TO 41": {return 7;}
            case "FROM 42 TO 48": {return 8;}
            case "FROM 49 TO 57": {return 9;}
            case "FROM 58 TO 66": {return 10;}
            case "FROM 67 TO 78": {return 11;}
            case "FROM 79 TO 94": {return 12;}
            case "ABOVE 95": {return 13;}
        }
        return 100;
    }

    public int checkHeightRange(String heightRange) {
        switch (heightRange) {
            case "UP TO 148": {return 8;}
            case "FROM 149 TO 157": {return 9;}
            case "FROM 158 TO 166": {return 10;}
            case "FROM 167 TO 178": {return 11;}
            case "FROM 179 TO 194": {return 12;}
            case "ABOVE 195": {return 13;}
        }
        return 100;
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
        return 100;
    }

    public int checkAgeRange(String ageRange) {
        switch (ageRange) {
            case "YOUNGER THAN 10": {return -1;}
            case "BETWEEN 11 AND 50": {return 0;}
            case "OLDER THAN 50": {return -1;}
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
        try {
           return din.get(new Tuple(calculateSkierCodeIncludingSkillLevelAndAge(), getShoeSizeRange()));
        } catch (NullPointerException e) {
            System.out.println("Result beyond the DIN table. Check selected parameters.");
        }
        return 0;
    }
}
