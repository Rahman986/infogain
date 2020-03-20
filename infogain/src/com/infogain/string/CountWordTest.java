package com.infogain.string;

import java.util.HashMap;
import java.util.Map;

public class CountWordTest {
	
	public void countWord(String input) {
		Map<String,String>map=new HashMap<String,String>();
		if(input!=null) {
	      String[]spreadWords=input.split(" ");
	      for(String str:spreadWords) {
	    	  if(map.containsKey(str)) {
	    		  int count=Integer.parseInt(map.get(str));
	    		  map.put(str,String.valueOf(count+1));
	    		  
	    	  }else {
	    		  map.put(str,"1");
	    	  }
	      }
	      System.out.println(map);
		}
	}
	public static void main(String[] args) {
		CountWordTest words=new CountWordTest();
		words.countWord("I am the good boy boy is good");
		
	}

}

