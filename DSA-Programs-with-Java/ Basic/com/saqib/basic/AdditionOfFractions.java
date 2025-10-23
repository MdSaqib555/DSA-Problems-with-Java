package com.saqib.basic;

public class AdditionOfFractions {
	public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 2, den1 = 3;
        int num2 = 3, den2 = 4;
        int commonDen = den1 * den2;
        int newNum1 = num1 * den2;
        int newNum2 = num2 * den1;
        int sumNum = newNum1 + newNum2;
        int gcd = gcd(sumNum, commonDen);
        sumNum /= gcd;
        commonDen /= gcd;
        System.out.println("Sum of fractions: " + sumNum + "/" + commonDen);
    }

}
