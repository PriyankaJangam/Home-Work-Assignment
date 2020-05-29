package com.hefshine.myass.collectionset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Integer obj=(Integer)itr.next();
			System.out.println(obj);
		}
	}

}
