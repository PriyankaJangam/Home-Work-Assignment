package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List list=new ArrayList();
		list.add(23);
		list.add(56);
		list.add(45);
		list.add(12);
		list.add(5);
	
		if(list.isEmpty())
		{
			System.out.println("List is Empty ");
		}
		else
		{
			System.out.println("List is not Empty ");
		}
	}

}
