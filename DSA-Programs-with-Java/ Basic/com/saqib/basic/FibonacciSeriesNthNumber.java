package com.saqib.basic;

public class FibonacciSeriesNthNumber {
	public static void main (String[]args) {
	     int num = 15;
	     int a = 0, b = 1;
	       System.out.print (a + " , " + b + " , ");
	     int c;
	     for (int i = 2; i < num; i++) {	       
	         c = a + b;
	         a = b;
	         b = c;
	          System.out.print (c + " , ");
	       }


	   }

}
