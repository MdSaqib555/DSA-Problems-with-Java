package com.saqib.basic;

public class PowerOfNumber {
	public static void main(String[] args) {
	    
		double num = 1.5;
	    int exponent = 2;
	    double result = 1.0;
	    
	    while (exponent != 0) {
	        result *= num;
	        exponent--;
	    }
	    
	    System.out.println("Result = " + result); 
		}

}
