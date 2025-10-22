package com.saqib.basic;

public class FactorialOfNumber {
	public static void main(String[] args) {
        int num = 5;  
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }

}
