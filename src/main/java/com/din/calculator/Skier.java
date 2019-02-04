package com.din.calculator;

import java.util.HashMap;
import java.util.Map;

public class Skier {

    private String level;
    private String ageRange;
    private String weightRange;
    private String heightRange;
    private String shoeSizeRange;

    public Skier(String level, String ageRange, String weightRange, String heightRange, String shoeSizeRange) {
        this.level = level;
        this.ageRange = ageRange;
        this.weightRange = weightRange;
        this.heightRange = heightRange;
        this.shoeSizeRange = shoeSizeRange;
    }

    public String getLevel() {
        return level;
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

    public int setWeightRange (String weightRange) {
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

    public int setHeightRange (String heightRange) {
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

    public int setSkierCode() {
        return (Math.min(setWeightRange(getWeightRange()), setHeightRange(getHeightRange())));
    }

    public int setSkillLevel(String skillLevel) {
        switch (skillLevel) {
            case "BEGINNER": {return 0;}
            case "INTERMEDIATE": {return 1;}
            case "ADVANCED": {return 2;}
        }
        return 0;
    }

    public int setAgeRange(String ageRange) {
        switch (ageRange) {
            case "UP TO 10": {return -1;}
            case "BETWEEN 11 - 50": {return 0;}
            case "OLDER THAN 50": {return -1;}
        }
        return 0;
    }

    public int countResult() {
        int result = setSkierCode() + setSkillLevel(getLevel()) + setAgeRange(getAgeRange());
        if (result < 1) {
            result = 1;
        }
        return result;
    }

    public double calculateDin() {
        Map<Tuple, Double> dinTable = new HashMap<>();
        dinTable.put(new Tuple(1, "<=230"), 0.75);

        return dinTable.get(new Tuple(countResult(), getShoeSizeRange()));
    }
}
