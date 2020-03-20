package com.infogain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPairsSum {
	
	static void printpair(int arr[],int sum) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("paisr is\t"+arr[i]+"\t"+arr[j]);
				}
			}
				
		}
	}
	public static void main(String[] args) {
		int sum=7;
		int arr[]= {1, 5, 2, -1, 5};
       // int n=arr.length;
        ArrayPairsSum.printpair(arr,sum);
	}
		
	}


