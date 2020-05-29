package com.hefshine.myass.collectionset;

import java.util.*;

public class Que11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		
		set.clear();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
	}

}
