package com.infogain;

import java.util.HashMap;
import java.util.Map;

public class FabonnaciSeries {
	
public static void main(String[] args) {
	
	int[]arr= {2,3,4,5,6,3,4,5,6,4};
	Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int a:arr) {
			if(!map.containsKey(a)) {
				map.put(a, 1);
				
			}else {
				int cnt=map.get(a);
				map.put(a,cnt+1);
				
			}
			System.out.println(map);
			
		}
		
	}

	
	
	/*int f=0,f1=1,f2,sum=0;
	System.out.println(f+"\t"+f1);
	for(int i=2;i<10;i++) {
		f2=f+f1;
		System.out.println(f2);
		f=f1;
		f1=f2;
	}*/
	/*int fact=1,num=5;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
		
	}
	System.out.println("factorial No\t"+fact);*/
	/*int fact=1,n=5;
	fact=factrorial(n);
	System.out.println(fact);*/

public static int factrorial(int n) {
	if(n==0) {
		return 1;
	}else {
		return (n*factrorial(n-1));
	}
	
}
}
