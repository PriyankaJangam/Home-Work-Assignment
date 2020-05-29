package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.List;

public class Que21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list =new ArrayList(10);
		System.out.println(list.size());
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		 
		
		list.trimToSize();
		System.out.println(list.size());
		
	}

}
