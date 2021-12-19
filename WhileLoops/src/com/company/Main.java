package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber){
            number++;
            if(isEvenNumber(number)){
                System.out.println(number + ": " + isEvenNumber(number));
                count++;
            }
            if(count == 5){
                break;
            }
        }

        System.out.println(count);
    }

    public static boolean isEvenNumber(int num){
        if(num % 2 == 0){
            return true;
        }

        return false;
    }
}
