package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Que12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list =new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("Original List ");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		list.add(90);
		System.out.println("Append element in last ");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
