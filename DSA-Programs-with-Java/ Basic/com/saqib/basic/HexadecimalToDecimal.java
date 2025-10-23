package com.saqib.basic;

public class HexadecimalToDecimal {
	public static void main(String[] args) {
        String hex = "2F";
        int decimal = 0;
        int length = hex.length();
        for (int i = 0; i < length; i++) {
            char ch = hex.charAt(i);
            int value;
            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else if (ch >= 'A' && ch <= 'F') {
                value = ch - 'A' + 10;
            } else if (ch >= 'a' && ch <= 'f') {
                value = ch - 'a' + 10;
            } else {
                System.out.println("Invalid hexadecimal digit: " + ch);
                return;
            }
            decimal = decimal * 16 + value;
        }

        System.out.println("Hexadecimal: " + hex);
        System.out.println("Decimal: " + decimal);
    }

}
