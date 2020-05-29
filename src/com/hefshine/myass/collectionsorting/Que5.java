package com.hefshine.myass.collectionsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("Java");
		list.add("Python");
		list.add("SQL");
		list.add("Adv._Java");
		list.add("Anguar");
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("Sorted Element ");
		Collections.sort(list);
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			String s=(String)itr1.next();
			System.out.print(s+" ");
		}
		
	}

}
