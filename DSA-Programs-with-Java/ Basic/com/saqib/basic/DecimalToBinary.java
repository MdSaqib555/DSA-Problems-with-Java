package com.saqib.basic;

public class DecimalToBinary {
	 public static void main(String[] args) {
	        int decimal = 25;
	        int num = decimal;
	        int[] binary = new int[32];
	        int index = 0;
	        while (num > 0) {
	            binary[index] = num % 2;
	            num = num / 2;
	            index++;
	        }

	        System.out.print("Decimal: " + decimal + "\nBinary: ");
	        for (int i = index - 1; i >= 0; i--) {
	            System.out.print(binary[i]);
	        }
	    }

}
