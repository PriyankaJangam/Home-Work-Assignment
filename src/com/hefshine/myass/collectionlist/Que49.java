package com.hefshine.myass.collectionlist;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Scanner;

public class Que49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList list1=new LinkedList();
		list1.add(20);
		list1.add(10);
		list1.add(20);
		list1.add(40);
		
		System.out.println("Enter Element to replace ");
		int ele=sc.nextInt();
		System.out.println("Enter new Element ");
		int elen=sc.nextInt();
		Collections.replaceAll(list1, ele, elen);
		Enumeration en=Collections.enumeration(list1);
		while(en.hasMoreElements())
		{
			
			Object obj=en.nextElement();
			System.out.println(obj);
		}
	}

}
