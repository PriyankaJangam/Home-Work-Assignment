package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Que24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.remove(3);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			Integer i=(Integer)obj;
			System.out.println(i);
		}
	}

}
