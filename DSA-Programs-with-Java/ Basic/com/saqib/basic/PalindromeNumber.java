package com.saqib.basic;

public class PalindromeNumber {
	public static void main(String[] args) {
        int number = 121; 
        int origNumber = number;
        int revNumber = 0;
        while (number != 0) {
            int digit = number % 10;      
            revNumber = revNumber * 10 + digit;  
            number = number / 10;          
        }
        if (origNumber == revNumber) {
            System.out.println(origNumber + " is a palindrome number.");
        } else {
            System.out.println(origNumber + " is not a palindrome number.");
        }
    }

}
