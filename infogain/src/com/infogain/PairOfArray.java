package com.infogain;

public class PairOfArray {
public static void main(String[] args) {
	int []arr= {10,10,10,20,20};
	int count=0;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]==arr[i+1])
		count++;
		
		++i;
		
	}
	System.out.println("count of Pair"+count);
}
}
