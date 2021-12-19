package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(1259));
    }

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        } else {
            int n = number;
            int sum = 0;
            while(n != 0){
                sum = sum + (n % 10);
                n = (int) n/10;
            }
            return sum;
        }
    }
}
