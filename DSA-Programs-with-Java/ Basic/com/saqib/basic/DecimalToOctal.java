package com.saqib.basic;

public class DecimalToOctal {
	 public static void main(String[] args) {
	        int decimal = 125; 
	        int num = decimal;
	        int[] octal = new int[32];
	        int index = 0;        
	        while (num > 0) {
	            octal[index] = num % 8;
	            num = num / 8;
	            index++;
	        }

	        System.out.print("Decimal: " + decimal + "\nOctal: ");
	        for (int i = index - 1; i >= 0; i--) {
	            System.out.print(octal[i]);
	        }

}}
