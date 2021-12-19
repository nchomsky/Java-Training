package com.company;

public class Dresser {
    private String color;
    private int numDrawers;
    private double height;
    private double length;
    private double depth;

    public Dresser(String color, int numDrawers, double height, double length, double depth) {
        this.color = color;
        this.numDrawers = numDrawers;
        this.height = height;
        this.length = length;
        this.depth = depth;
    }

    public String getColor() {
        return color;
    }

    public int getNumDrawers() {
        return numDrawers;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getDepth() {
        return depth;
    }
}
