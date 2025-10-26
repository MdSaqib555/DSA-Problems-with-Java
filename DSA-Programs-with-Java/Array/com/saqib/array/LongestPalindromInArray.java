package com.saqib.array;

public class LongestPalindromInArray {
	  static boolean isPalindrome(int n)
	    {
	          int divisor = 1;
	          while (n / divisor >= 10)
	             divisor *= 10;
	          while (n != 0) {
	             int x = n / divisor;
	             int y = n % 10;
	             if (x != y)
	               return false;
	             n = (n % divisor) / 10;
	            divisor = divisor / 100;
	         }
	         return true;
	    }

	  	    static int largestPalindrome(int []A, int n)
	    {
	         int res = -1;

	         for (int i = 0; i < n; i++) {  
	                 if (A[i] > res && isPalindrome(A[i]))
	                     res = A[i];
	         }

	        return res;
	     }

	    
	    public static void main(String []args)
	    {
	       int []A = { 121, 2322, 54545, 999990 };
	       int n = A.length;

	      
	      System.out.println(largestPalindrome(A, n));
	    }


}
