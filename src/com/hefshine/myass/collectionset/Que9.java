package com.hefshine.myass.collectionset;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set=new TreeSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		
	
		Iterator itr=set.descendingIterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
	}

}
