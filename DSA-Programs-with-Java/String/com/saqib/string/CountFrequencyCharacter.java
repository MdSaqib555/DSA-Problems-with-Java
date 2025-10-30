package com.saqib.string;

public class CountFrequencyCharacter {
	 public static void main(String[] args) {
	        String str = "programming"; 
	        int[] freq = new int[str.length()];

	        char[] chars = str.toCharArray();
	        
	        for (int i = 0; i < str.length(); i++) {
	            freq[i] = 1;
	            for (int j = i + 1; j < str.length(); j++) {
	                if (chars[i] == chars[j]) {
	                    freq[i]++;
	                    chars[j] = '0'; 
	                }
	            }
	        }

	        System.out.println("Character frequencies in the string:");
	        for (int i = 0; i < str.length(); i++) {
	            if (chars[i] != ' ' && chars[i] != '0') {
	                System.out.println(chars[i] + " - " + freq[i]);
	            }
	        }
	    }
	}


