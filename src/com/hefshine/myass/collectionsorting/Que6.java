package com.hefshine.myass.collectionsorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Que6 {
	
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		
		Integer i1= new Integer(45);
		Integer i2= new Integer(145);
		Integer i3= new Integer(245);
		Integer i4= new Integer(8945);
		Integer i5= new Integer(1145);
		Integer i6= new Integer(545);
		
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		list.add(i5);
		list.add(i6);
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<list.size();j++)
			{
				if((Integer)list.get(i) <(Integer)list.get(j))
				{
				Integer temp=(Integer)list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
					
				}
			}
		}
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}

		
	}

	

}
