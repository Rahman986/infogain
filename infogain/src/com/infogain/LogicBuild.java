package com.infogain;

public class LogicBuild {
	public static void main(String[] args) {
		ExceptionChaining e=new ExceptionChaining();
		e.m1(null);
		//UserInvalidException.validUser(10);
		
	}

}
class ExceptionChaining{
	public void m1(Integer i) {
		System.out.println("Arithemetic Exception");
	}
	
	public void m1(String s) {
		System.out.println("Runtime Exception");
	}
	

/*class UserInvalidException extends RuntimeException{
	
	UserInvalidException(String name){
		super(name);
	}
	public static void validUser(int age) {
		if(age<18) {
			throw new UserInvalidException("USer is not Eligible for voting");
		}else {
			System.out.println("Wait for some years");
		}
	}*/
}
