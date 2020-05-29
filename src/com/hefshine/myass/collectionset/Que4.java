package com.hefshine.myass.collectionset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1=new ArrayList();
		list1.add(20);
		list1.add(10);
		list1.add(10);
		list1.add(40);
		
		Set set=new HashSet(list1);
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Integer obj=(Integer)itr.next();
			System.out.println(obj);
		}
	}

}
