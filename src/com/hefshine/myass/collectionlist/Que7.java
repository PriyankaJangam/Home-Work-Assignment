package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		for(int i=1;i<=50;i++)
		{
			list.add(i);
		}
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			
			Object obj=itr.next();
			Integer i=(Integer)obj;
			if(i%2==0)
			     System.out.println(i);
			
		}
	}

}
