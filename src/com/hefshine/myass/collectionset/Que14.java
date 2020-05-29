package com.hefshine.myass.collectionset;

import java.util.Iterator;
import java.util.TreeSet;

public class Que14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set=new TreeSet();
		
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
