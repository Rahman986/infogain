package com.infogain;

public class StaticBlockConcept {
	
	
	public static void main(String[] args) {
		M.m1();
		M m=new M();
		
		
		//System.out.println("Main Completed");
	}

}
class M{
	M(){
		System.out.println("Default Constructor M()");
	}
	
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block");
	}
	static void m1() {
		System.out.println("Static method m1()");
	}
}
