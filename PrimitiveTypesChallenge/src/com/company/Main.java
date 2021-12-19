package com.company;

public class Main {

    public static void main(String[] args) {

//        Challenge below this:
        byte myByte = 24;
        short myShort = 200;
        int myInt = 50000;
        Long myLong = 50000L + (10L*(myByte + myShort + myInt));
        System.out.println(myLong);
        
    }
}
