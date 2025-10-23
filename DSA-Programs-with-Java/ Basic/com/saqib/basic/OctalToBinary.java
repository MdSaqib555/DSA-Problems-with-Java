package com.saqib.basic;

public class OctalToBinary {
	 public static void main(String[] args) {
	        String octal = "135"; 
	        int decimal = 0;
	        int power = 1; 
	        for (int i = octal.length() - 1; i >= 0; i--) {
	            int digit = octal.charAt(i) - '0';
	            decimal += digit * power;
	            power *= 8;
	        }
	        String binary = "";
	        int num = decimal;
	        while (num > 0) {
	            binary = (num % 2) + binary;
	            num = num / 2;
	        }

	        System.out.println("Octal: " + octal);
	        System.out.println("Binary: " + binary);
	    }

}
