package com.saqib.basic;

public class HarshadNumber {
	  public static void main(String[] args) {
			int num = 47;
			int result = 0;
			while(num != 0)
			{
				int digit = num % 10;
				result = result + digit;
				num = num/ 10;
			}
	      if(num % result == 0)
	      System.out.println("Harshad Number");
	          else
	        System.out.println("Not a Harshad Number");
	}

}
