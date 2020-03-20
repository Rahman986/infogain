package com.infogain;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
  private ArrayList<String>al;
  DynamicArray(){
	  al=new ArrayList<String>();
	  
  }
  public void clear() {
	  al.clear();
  }
  public int size() {
	  return al.size();
  }
  public void insert(String str) {
	  al.add(str);
  }
  public String get(int index) {
	  if(index>=al.size()) 
		  return "";
		  return al.get(index);
	  }
  public void remove(String str) {
	  al.remove(str);
  }
  public void display() {
	  System.out.println("Display the Size of Array"+al);
  }
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Dynamic Array Test\n");
	DynamicArray dy=new DynamicArray();
	char ch;
	do {
	System.out.println("\nDynamic Array\n");
	System.out.println("1:insert ");
	System.out.println("2: remove by index");
	System.out.println("3:remove by value ");
	System.out.println("4:clear");
	System.out.println("5:size ");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("Enter value to inset");
		dy.insert(sc.next());
		break;
	case 2:
		System.out.println("Enetr index");
		dy.remove(sc.next());
		break;
		case 3:
			System.out.println("Enter value");
			dy.remove(sc.next());
			break;
		case 4:
			System.out.println("Dynamic array clear");
			dy.clear();
			break;
		case 5:
			System.out.println("Size="+dy.size());
			break;
			default:
				System.out.println("Worng Entry \n");
				break;
		}
	dy.display();
	System.out.println("\n Do you want to continue(Type Y or N)\n");
	ch=sc.next().charAt(0);
	
	}while(ch=='Y'||ch=='y');
	
	
}
  }  
  

