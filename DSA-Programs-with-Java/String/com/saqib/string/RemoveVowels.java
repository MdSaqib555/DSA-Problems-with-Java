package com.saqib.string;

public class RemoveVowels {
	 public static void main(String[] args) {
	        String str = "Programming is fun"; 
	        String result = str.replaceAll("[AEIOUaeiou]", "");
	        System.out.println("Original String: " + str);
	        System.out.println("String after removing vowels: " + result);
	    }

}
