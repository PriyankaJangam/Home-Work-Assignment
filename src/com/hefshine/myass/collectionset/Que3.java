package com.hefshine.myass.collectionset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Que3 {

	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("Black");
		set.add("Red");
		set.add("Pink");
		set.add("Blue");
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			String obj=(String)itr.next();
			System.out.println(obj);
		}

	}

}
