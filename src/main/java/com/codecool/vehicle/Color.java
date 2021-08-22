package com.codecool.vehicle;

public enum Color {
    RED("#FF0000"),
    BLUE("#0000FF");

    private final String hexValue;

    Color(String hexValue) {
        this.hexValue = hexValue;
    }

    public String getHexValue() {
        return hexValue;
    }
}
