package com.saqib.basic;

public class OctalToDecimal {
	public static void main(String args[]) {
	     
		int octal=512;  
		int decimal = 0;
		int n = 0;  		
		while(octal > 0)
		{
			int temp = octal % 10;  
			decimal += temp * Math.pow(8, n);  
			octal = octal/10;  
			n++;  
		}
		System.out.println("Decimal number : "+decimal);   
	}
}


