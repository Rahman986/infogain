package com.infogain;

public class DynamicArraySize {
	
 static int[]increaseSizeOfArrayList(int []arr){
	 int[]brr=new int[(arr.length*2)];
	 
	 for(int i=0;i<arr.length;i++) {
		 brr[i]=arr[i];
		 
	 }
	 return brr;
 }
 
 public static void main(String[] args) {
	int[]arr=new int[5];
	for(int i=0;i<11;i++) {
		if(i<arr.length) {
			arr[i]=i+100;
		}else {
			arr=increaseSizeOfArrayList(arr);
			arr[i]=i+10;
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println("arr="+arr[i]);
		arr[i]=i+100;
	}
}
}
