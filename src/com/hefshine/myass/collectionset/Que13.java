package com.hefshine.myass.collectionset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Que13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		
		TreeSet set1=new TreeSet(set);
		Iterator itr=set1.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
	}

}
