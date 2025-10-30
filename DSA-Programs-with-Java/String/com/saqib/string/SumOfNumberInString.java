package com.saqib.string;

public class SumOfNumberInString {
	public static void main(String[] args) {
        String str = "a1b2c3d4"; 
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        System.out.println("Sum of digits in string: " + sum);
    }

}
