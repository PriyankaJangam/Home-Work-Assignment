package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Que56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		List list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		ListIterator itr=list.listIterator();
		while(itr.hasNext())
		{
			 sum=sum+(int)itr.next();
			
		}
		System.out.println(sum);
	}

}
