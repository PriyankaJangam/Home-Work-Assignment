package com.hefshine.myass.collectionset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Que5 {

	public static void main(String[] args) {
		Set set=new HashSet();
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
