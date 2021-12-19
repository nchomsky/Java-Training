package com.company;

public class Main {

    public static void main(String[] args) {
        // int, boolean, and double are most popular data types
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "this is a string";
        System.out.println("myString is: " + myString);
        myString = myString + ", and this is more";
        System.out.println(myString);
        myString = myString + " \u00A9 2019";
        System.out.println(myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastSrign is " + lastString);
    }
}
