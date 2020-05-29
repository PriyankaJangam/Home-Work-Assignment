package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Que38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("Back");
		list.add("Red");
		list.add("Blue");
		list.add("Pink");
		
		System.out.println("Colour List ");
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			Object obj=itr1.next();
			String i=(String)obj;
			System.out.print(i+" ");
		}
	}

}
