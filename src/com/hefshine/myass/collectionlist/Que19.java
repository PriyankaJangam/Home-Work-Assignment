package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Que19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1 =new ArrayList();
		list1.add("priyanka");
		list1.add("abhay");
		list1.add("Khushal");
		list1.add("jyoti");
		
		List list2 =new ArrayList();
		list2.add("priyanka");
		list2.add("abhay");
		list2.add("Khushal");
		list2.add("jyoti");
	
		if(list1.equals(list2))
		{
			Iterator itr=list2.iterator();
			while(itr.hasNext())
			{
				Object obj=itr.next();
				String i=(String)obj;
				System.out.println(i);
			}
		}
	}

}
