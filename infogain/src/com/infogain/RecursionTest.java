package com.infogain;

import java.util.Arrays;

public class RecursionTest {
	public static int factroal(int n) {
		if(n==0)
			return 1;
		else {
			return(n*factroal(n-1));
		}
	}
	public static void main(String[] args) {
		int n=5;
		int []arr= {2,5,6,3,9};
		System.out.println("Before Sorting"+arr.toString());
		Arrays.sort(arr);
		System.out.println("After Sorting"+arr.toString());
		
	
	}
}
