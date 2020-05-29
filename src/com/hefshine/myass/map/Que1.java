package com.hefshine.myass.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new TreeMap();
		map.put(1,"Priyanka");
		map.put(2,"Abhay");
		map.put(3,"Khushal");
		map.put(4,"Shubham");
		
		Set s=map.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
	}

}
