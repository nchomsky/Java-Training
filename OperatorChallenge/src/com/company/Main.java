package com.company;

public class Main {

    public static void main(String[] args) {
        double num1 = 20.00d;
        double num2 = 80.00d;
        double result = (num1 + num2) * 100.00d;
        double remainder = result % 40.00d;
        System.out.println("The remainder: " + remainder);
        boolean isZero = remainder == 0 ? true : false;
        System.out.println(isZero);

        if(!isZero){
            System.out.println("got some remainder");
        }
    }
}
