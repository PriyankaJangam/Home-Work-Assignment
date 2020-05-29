package com.hefshine.myass.collectionlist;

import java.util.LinkedList;

public class Que43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1=new LinkedList();
		list1.add(20);
		list1.add(10);
		list1.add(10);
		list1.add(40);
		System.out.println("Retrive First Element but not remove ");
		System.out.println(list1.peekFirst());
	}

}
