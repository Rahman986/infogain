package com.infogain.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
public static void main(String[] args) {
	Hashtable<String,String>map=new Hashtable<String,String>();
	map.put("aaa","xxx");
	map.put("bbb","yyy");
	map.put("ccc","zzz");
	map.put("bbb","ppp");
	map.put(null,"ddd");
	Set set=map.keySet();
	Iterator it=set.iterator();
	while(it.hasNext()) {
		
		System.out.println(it.next());
		System.out.println(it.next());
	}


}
}
