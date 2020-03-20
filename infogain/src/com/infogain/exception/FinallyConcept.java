package com.infogain.exception;

public interface FinallyConcept {
	public static void main(String[] args) throws Exception {
		String s =new String("java");
		String s1=s.intern();
		System.out.println(s==s1);
		//System.out.println(s.intern() == s1.intern());
	}

}
