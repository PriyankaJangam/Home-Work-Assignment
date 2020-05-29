package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.List;

public class Que37 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(" List ");
		list.forEach((n)->
		System.out.println(n));
	}

}
