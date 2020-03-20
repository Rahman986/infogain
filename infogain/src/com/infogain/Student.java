package com.infogain;

public class Student {
	private int id;
   Student(int id){
	   this.id=id;
   }
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public static void main(String[] args) {
		Student s=new Student(10);
		Student s1=new Student(10);
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
	}

}
