package com.din.calculator;

public class Tuple {

    private int skierCode;
    private String shoeSizeRange;

    public Tuple(int skierCode, String shoeSizeRange) {
        this.skierCode = skierCode;
        this.shoeSizeRange = shoeSizeRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tuple tuple = (Tuple) o;

        if (skierCode != tuple.skierCode) return false;
        return shoeSizeRange != null ? shoeSizeRange.equals(tuple.shoeSizeRange) : tuple.shoeSizeRange == null;
    }

    @Override
    public int hashCode() {
        int result = skierCode;
        result = 31 * result + (shoeSizeRange != null ? shoeSizeRange.hashCode() : 0);
        return result;
    }
}
