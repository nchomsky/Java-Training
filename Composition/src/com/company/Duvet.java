package com.company;

public class Duvet {
    private String color;
    private String material;
    private boolean clean;

    public Duvet(String color, String material, boolean clean) {
        this.color = color;
        this.material = material;
        this.clean = clean;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isClean() {
        return clean;
    }
}
