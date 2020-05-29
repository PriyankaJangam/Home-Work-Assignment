package com.hefshine.myass.collectionlist;

import java.util.LinkedList;

public class Que47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1=new LinkedList();
		list1.add(20);
		list1.add(10);
		list1.add(20);
		list1.add(40);
		
		LinkedList list2=new LinkedList();
		list2.add(20);
		list2.add(10);
		list2.add(20);
		list2.add(40);
		
		if(list1.equals(list2))
		{
			System.out.println("List are Equal");
		}
		else
		{
			System.out.println("List are not Equal");
		}
	}

}
