package com.infogain;

public class ExampleOfCoverent {
public static void main(String[] args) {
	SuperClass sb=new SubClass();
	sb.get();
}
}
class SuperClass{
	SuperClass get() {
		System.out.println("Super class");
		return this;
	}
}
class SubClass extends SuperClass{
	SubClass get() {
		System.out.println("Subclass class");
		return this;
	}
	
	
}
