package com.saqib.basic;

public class PerfectSquare {
    public static void main(String[] args) {
        int number = 49;
        boolean isPerfectSquare = false;
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }


}
