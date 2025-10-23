package com.saqib.basic;

public class DecimalToHexadecimal {
	 public static void main(String[] args) {
	        int decimal = 438; 
	        int num = decimal;
	        char[] hex = new char[32];
	        int index = 0;
	        while (num > 0) {
	            int remainder = num % 16;
	            if (remainder < 10) {
	                hex[index] = (char) (remainder + '0');
	            } else {
	                hex[index] = (char) (remainder - 10 + 'A');
	            }
	            num = num / 16;
	            index++;
	        }

	        System.out.print("Decimal: " + decimal + "\nHexadecimal: ");
	        for (int i = index - 1; i >= 0; i--) {
	            System.out.print(hex[i]);
	        }
	    }

}
