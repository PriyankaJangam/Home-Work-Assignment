package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.List;

public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add(23);
		list.add(56);
		list.add(45);
		list.add(43);
		
		list.clear();
		if(list.isEmpty())
		{
			System.out.println("List is clear ");
		}
		else
		{
			System.out.println("List is not clear");
		}
		
	}

}
