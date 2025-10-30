package com.saqib.string;

public class IsCharacterVowelsOrNot {
	public static void main(String[] args) {
        char ch = 'E'; 
        ch = Character.toLowerCase(ch); 
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) {
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }

}
