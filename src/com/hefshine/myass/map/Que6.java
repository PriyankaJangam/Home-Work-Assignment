package com.hefshine.myass.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put(1,"Priyanka");
		map.put(2,"Abhay");
		map.put(3,"Khushal");
		map.put(4,"Shubham");
		
		Set s=map.keySet();
		System.out.println(s);
	}

}
