package com.hefshine.myass.collectionset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Que16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new LinkedHashSet();

		set.add("Priyanka");
		set.add("Khushal");
		set.add("Abhay");
		set.add("Shubham");
		set.add("Jyoti");
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println(s);
		}
	}

}
