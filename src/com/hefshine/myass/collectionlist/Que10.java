package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.List;

public class Que10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Object a[]=list.toArray();
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
	}

}
