package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Que17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("priyanka");
		list.add("abhay");
		list.add("shubham");
		list.add("jyoti");
		list.add("khushal");
		
		Collections.sort(list);
		Enumeration en=Collections.enumeration(list);
		while(en.hasMoreElements())
		{
			Object obj=en.nextElement();
			String i=(String)obj;
			System.out.println(i);
		}
		
	}

}
