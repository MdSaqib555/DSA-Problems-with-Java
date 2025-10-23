package com.saqib.basic;

public class BinaryToOctal {
	 public static void main(String[] args) {
	     String binary = "1011101"; 
	     int decimal = 0;
	     int length = binary.length();
         for (int i = 0; i < length; i++) {
        	 char ch = binary.charAt(length - 1 - i); 
	         if (ch == '1') {
	              decimal += Math.pow(2, i);
        }
	          else if (ch != '0') {
	              System.out.println("Invalid binary number");
	              return;
	            }
	        }
	      String octal = "";
	      int num = decimal;
	      while (num > 0) {
	          octal = (num % 8) + octal;
	          num = num / 8;
	        }
	        System.out.println("Binary: " + binary);
	        System.out.println("Octal: " + octal);
	    }

}
