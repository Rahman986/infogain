package com.infogain;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Employee e=new Employee("abc",10,"male");
		Employee e1=new Employee("abc",10,"male");
		Employee e2=new Employee("abc",10,"female");
		Employee e3=new Employee("abdc",10,"male");
		Employee e4=new Employee("abc",10,"male");

	Set<Employee>list=new HashSet();
	list.add(e);
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	System.out.println(list.size());
	
	}

}
