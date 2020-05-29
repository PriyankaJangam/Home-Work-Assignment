package com.hefshine.myass.collectionset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new TreeSet();
		set.add("Priyanka");
		set.add("Abhay");
		set.add("Shubham");
		set.add("Khushal");
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
	}

}
