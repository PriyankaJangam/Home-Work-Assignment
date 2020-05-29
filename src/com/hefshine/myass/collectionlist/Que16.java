package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Que16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1 =new ArrayList();
		list1.add("priyanka");
		list1.add("abhay");
		list1.add("Khushal");
		
		List list2 =new ArrayList();
		list2.add("jyoti");
		list2.addAll(list1);
		
		Enumeration en=Collections.enumeration(list2);
		while(en.hasMoreElements())
		{
			Object obj=en.nextElement();
			String i=(String)obj;
			System.out.println(i);
		}
		
		
		
	}

}
