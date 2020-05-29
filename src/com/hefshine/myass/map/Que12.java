package com.hefshine.myass.map;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Que12 {

	public static void main(String[] args) {
		TreeMap map=new TreeMap();
		map.put(8,"Priyanka");
		map.put(2,"Abhay");
		map.put(3,"Khushal");
		map.put(4,"Shubham");
		
		System.out.println("Lower Key "+ map.firstKey()) ;
		System.out.println("Higher Key "+ map.lastKey());
	}

}
