package com.infogain;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class NameSortComparator implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2) {
		return e1.getName().compareTo(e2.getName());
		
	}
	
	public static void main(String[] args) {
		
		String s="haseeb";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
			
		}
		
		
		int []arr= {2,5,6,-1,5,7};
		int sum=6;
	
		String str="haseeburrahman";
		char[]c=str.toCharArray();
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for( char ch:c) {
			if(!map.containsKey(ch)) {
				map.put(ch,1);
			}else {
				int cnt=map.get(ch);
				map.put(ch,cnt+1);
			}
			//System.out.println(map);
			
		}
		
		
	}

}
