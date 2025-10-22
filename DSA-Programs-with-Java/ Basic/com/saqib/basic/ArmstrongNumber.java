package com.saqib.basic;

public class ArmstrongNumber {
	 public static void main(String[] args) {
	        int number = 153;  
	        int origNumber = number;
	        int result = 0;

	        while (number != 0) {
	            int digit = number % 10;            
	            result += digit * digit * digit;    
	            number /= 10;                       
	        }

	        if (result == origNumber) {
	            System.out.println(origNumber + " is an Armstrong number.");
	        } else {
	            System.out.println(origNumber + " is not an Armstrong number.");
	        }
	    }
	

}
