package com.saqib.basic;

public class AbundantNumber {
	 public static void main (String[]args) {
	     int num = 12, sum = 0;
	     for (int i = 1; i < num; i++) { if (num % i == 0) sum = sum + i; } if (sum > num) {
	     	System.out.println (num + " is an Abundant Number");
	     	System.out.println ("The Abundance is: " + (sum - num));
	       }
	     else
	       System.out.println (num + " is not an Abundant Number");
	   }

}
