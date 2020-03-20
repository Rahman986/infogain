package com.infogain.string;

public class A {
	public static void main(String[] args) {
	Test t=new Test();
	t.m1();
	t.m1();
   C c=new C();
   c.m1();
	}

}
class Test{
	synchronized static void m1() {
		System.out.println("hello");
	}
}

interface I{
	default void m1() {
		System.out.println("I m1()");
		
	}
}
interface I2{
	default void m1() {
		System.out.println("I2 m1()");
	}
}
class C implements I,I2{
	public  void m1() {
		
	}
}

class Recursion{
	
	static int recursionadd(int n) {
		for
	}
	
	
}