package com.hefshine.myass.map;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Que9 {

	public static void main(String[] args) {
		TreeMap map=new TreeMap();
		map.put(1,"Priyanka");
		map.put(2,"Abhay");
		map.put(3,"Khushal");
		map.put(4,"Shubham");
		
		TreeMap map1=new TreeMap();
		
		map1=(TreeMap)map.clone();
		
		Set s=map1.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			Map.Entry me=(Map.Entry)obj;
			System.out.println(me);
		}
		
	}

}
