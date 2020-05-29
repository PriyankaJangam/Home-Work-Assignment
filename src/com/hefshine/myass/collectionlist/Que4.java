package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Element ");
		int element=sc.nextInt();
		
		List list=new ArrayList();
		list.add(23);
		list.add(56);
		list.add(45);
		list.add(43);
		
		//System.out.println(list.get(0));
		if(list.contains(element))
		{
			System.out.println(" Element is Present ");
		}
		else
		{
			System.out.println("Element is not Present ");
		}
	}

}
