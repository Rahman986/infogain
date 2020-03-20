package com.infogain.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableExample {
	public static void main(String[] args) {
		List<Cirketor>cirket=new ArrayList<Cirketor>();
		cirket.add(new Cirketor(20,"haseeb"));
		cirket.add(new Cirketor(40,"Rahim"));
		cirket.add(new Cirketor(30,"Nazim"));
		cirket.add(new Cirketor(13,"Istiyak"));
		cirket.add(new Cirketor(29,"abuzar"));
		cirket.add(new Cirketor(24,"Ali"));
		cirket.add(new Cirketor(23,"Adnand"));
		System.out.println("Before Sorting Run by Cirketor Name \t"+cirket);
		Collections.sort(cirket );
		
		Iterator it=cirket.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}


}

class Cirketor implements Comparable<Cirketor>{
	int runs;
	String name;
	public Cirketor(int runs, String name) {
		super();
		this.runs = runs;
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cirketor [runs=" + runs + ", name=" + name + "]";
	}
	public int compareTo(Cirketor that) {
		if(this.runs>that.runs) {
			return 1;
		}
		if(this.runs<that.runs) {
			return -1;
		}
		return 0;
	}
	
}
