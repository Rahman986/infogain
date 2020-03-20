package com.infogain;

public class Test1 {
	
	public static void main(String[] args) {
		
		try {
			
			int i=10/0;
			
						
		}
		catch(ArithmeticException e)
		{
			
			System.out.println(e);
			System.exit(0);		
		}
		finally {
			
			System.out.println("Finall block");
		}
		System.out.println("Out from try- catch- finally");
	}

}
