package com.infogain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Employee {
    private int id;
	private String name;
	private int salary;
	private int age;
	
	public Employee(int id, String name, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return + id + "\t" + name + "\t" + salary + "\t" + age;
	}
	
	public static void main(String[] args) {
		
		
		Employee[]newEmployee=new Employee[4];
		newEmployee[0]=new Employee(11,"Haseeb",20000,27);
		newEmployee[1]=new Employee(9,"Mahbbob",520000,35);
		newEmployee[2]=new Employee(21,"Jamil",2000,26);
		newEmployee[3]=new Employee(32,"Sarfulla",20000,23);
		System.out.println("Before Sorting: "+Arrays.toString(newEmployee));
		Arrays.sort(newEmployee,new NameSortComparator());
		System.out.println("After Sorting:"+Arrays.toString(newEmployee));
	}

}
