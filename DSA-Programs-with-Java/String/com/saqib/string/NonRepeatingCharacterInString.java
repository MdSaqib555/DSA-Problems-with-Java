package com.saqib.string;

public class NonRepeatingCharacterInString {
	public static void main(String[] args) {
        String str = "programming"; 
        str = str.toLowerCase(); 
        System.out.println("Non-repeating character in the string: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.print(ch + " ");
            }
        }
    }

}
