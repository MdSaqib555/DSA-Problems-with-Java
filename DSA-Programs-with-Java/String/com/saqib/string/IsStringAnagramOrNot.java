package com.saqib.string;

import java.util.Arrays;

public class IsStringAnagramOrNot {
	public static void main(String[] args) {
        String str1 = "listen";  
        String str2 = "silent";  
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams.");
        } else {
           
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Strings are anagrams.");
            } else {
                System.out.println("Strings are not anagrams.");
            }
        }
    }

}
