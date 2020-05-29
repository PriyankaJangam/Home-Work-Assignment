package com.hefshine.myass.collectionlist;

import java.util.*;
import java.util.ArrayList;

public class Que8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1=new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		List list2=new ArrayList();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(50);
		
		if(list1.equals(list2))
		{
			System.out.println("collection are equal");
		}
		else{
			System.out.println("Collection are not equal");
		}
		
	}

}
