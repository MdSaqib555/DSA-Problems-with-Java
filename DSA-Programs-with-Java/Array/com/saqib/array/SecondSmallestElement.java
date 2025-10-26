package com.saqib.array;

public class SecondSmallestElement {
	public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second smallest element: " + secondSmallest);
    }
}


