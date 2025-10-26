package com.saqib.array;

public class SortingElementsByFrequency {
	 public static void main(String[] args) {
	        int[] arr = {4, 5, 6, 5, 4, 3, 5};
	        int n = arr.length;
	        int[] freq = new int[n];
	        boolean[] visited = new boolean[n];
	        for (int i = 0; i < n; i++) {
	            if (visited[i]) continue;

	            int count = 1;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    visited[j] = true;
	                }
	            }
	            freq[i] = count;
	        }
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (freq[i] < freq[j]) {
	     
	                    int tempFreq = freq[i];
	                    freq[i] = freq[j];
	                    freq[j] = tempFreq;

	                    int tempVal = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = tempVal;
	                }
	                else if (freq[i] == freq[j] && arr[i] > arr[j]) {
	                    int tempVal = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = tempVal;
	                }
	            }
	        }
	        System.out.println("Array elements sorted by frequency:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}


