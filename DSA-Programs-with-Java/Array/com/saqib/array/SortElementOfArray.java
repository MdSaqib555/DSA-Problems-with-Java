package com.saqib.array;

public class SortElementOfArray {
	 public static void main(String[] args) {
	        int[] arr = {5, 2, 9, 1, 3};
	        int n = arr.length;
	        int temp;
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] > arr[j]) { 
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }}
	        System.out.println("Array in ascending order:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }

}
