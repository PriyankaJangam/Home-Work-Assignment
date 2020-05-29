package com.hefshine.myass.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new TreeMap();
		map.put(1,79);
		map.put(2,89);
		map.put(3,97);
		map.put(4,45);
		
		Set s=map.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
	}

}
