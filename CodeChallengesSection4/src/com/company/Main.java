package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    //Challenge 1 - Speed Converter
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        } else {
            long mph = Math.round(kilometersPerHour/1.609);
            return mph;
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    //Challenge 2 - MegaBytes Converter
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {

        }
    }
    //Challenge 3 - Barking Dog
    //Challenge 4 - Leap Year Calculator
    //Challenge 5 - DecimalComparator
    //Challenge 6 - Equal Sum Checker
    //Challenge 7 - Teen Number Checker
}
