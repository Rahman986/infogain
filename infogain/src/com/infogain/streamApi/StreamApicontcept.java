package com.infogain.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApicontcept {
public static void main(String[] args) throws Exception {
	ArrayList<Integer>l=new ArrayList<Integer>();
	l.add(10);
	l.add(50);
	l.add(8);
	l.add(41);
	l.add(76);
	l.add(13);
	l.add(18);
	System.out.println(l);
	// for find the even nmuber through stream api
	List<Integer>l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
	// for stream api using map
	List<Integer>updatedMarks=l.stream().map(i->i+5).collect(Collectors.toList());
	Long onOfFialStudent=l.stream().filter(i->i<33).count();
	
	  List<Integer> sortedStudent=l.stream().map(i->i).sorted().collect(Collectors.toList());
	  //or
	  List<Integer>sortedStudentMarks=l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
	  
	  System.out.println("sortedStudentMarks\t"+sortedStudentMarks);
	  System.out.println("sorted Student\t"+sortedStudent);
	  System.out.println("Find Even No\t"+l2);
	  System.out.println("Add 5 Marks for Every Student\t"+updatedMarks);
	  System.out.println("Count the fails student\t"+onOfFialStudent);
	  P p=new P();
	  p.m1();
	
	
	
}
}
class P{
	void m1() throws Exception{
		System.out.println("P m1()");
	}
	
}
class C extends P{
	void m1() throws ArithmeticException{
		System.out.println("C m1()");
	}
	
}