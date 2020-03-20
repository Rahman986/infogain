package com.infogain;

public class StringSwaping {
	public static void main(String[] args) {
		
		Integer i=10;
		System.out.println(i.toString());
		
		String a="Delhi";
		String b="Noida";
		System.out.println("A\t"+a);
		System.out.println("B\t"+b);
		a=a+b;
	
		b=a.substring(0,(a.length()-b.length()));
		a=a.substring(b.length(),(a.length()));
		
		System.out.println("A\t"+a);
		System.out.println("B\t"+b);
	}

}
