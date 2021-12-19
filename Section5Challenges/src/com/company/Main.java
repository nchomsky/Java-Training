package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    //    Coding Exercise 15: is Palindrome
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int n = number;
        while(n != 0){
            reverse = (reverse*10) + (n % 10);
            n = (int) n / 10;
        }

        if(reverse == number){
            return true;
        } else {
            return false;
        }
    }

//    Coding Exercise 16: First and Last Digit Sum
    public static int sumFirstAndLast(int number){

    }
//    Coding Exercise 17: Even Digit Sum
    public static int getEvenDigitSum(int number){

    }
//    Coding Exercise 18: Shared Digit
//    Coding Exercise 19: Last Digit checker
//    Coding Exercise 20: Greatest Common Diviser
}
