package com.hefshine.myass.collectionlist;

import java.util.*;
import java.util.ArrayList;

public class Que20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list =new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.clear();
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			Object obj=itr.next();
			String i=(String)obj;
			System.out.println(i);
		}
	}

}
