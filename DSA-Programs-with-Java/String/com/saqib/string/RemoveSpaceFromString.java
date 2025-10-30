package com.saqib.string;

public class RemoveSpaceFromString {
	public static void main(String[] args) {
        String str = "Java is fun to learn";
        String result = str.replaceAll("\\s", ""); 
        System.out.println("String after removing spaces: " + result);
    }

}
