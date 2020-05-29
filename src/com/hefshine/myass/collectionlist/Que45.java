package com.hefshine.myass.collectionlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Que45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList list1=new LinkedList();
		list1.add(20);
		list1.add(10);
		list1.add(10);
		list1.add(40);
		System.out.println("Enter Element to Search ");
		int ele=sc.nextInt();
		if(list1.contains(ele))
		{
			System.out.println("Element is Present");
		}
		else
		{
			System.out.println("Element is not Present");
		}
		
	}

}
