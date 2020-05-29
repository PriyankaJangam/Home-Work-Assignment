package com.hefshine.myass.collectionlist;

import java.util.*;

public class Que11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list =new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		Collections.swap(list, 0, 1);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
