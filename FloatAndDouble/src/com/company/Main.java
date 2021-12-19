package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min value: " + myMinFloatValue);
        System.out.println("Float Max Value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min value: " + myMinDoubleValue);
        System.out.println("Double Max Value: " + myMaxDoubleValue);

        int myIntValue = 5/2;
        float myFloatValue = 5f/2f;
        double myDoubleValue = 5d/2d;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double poundsRatio = 0.45359237d;
        double pounds = 25d;
        double totalKg = pounds*poundsRatio;

        System.out.println(totalKg);
    }
}
