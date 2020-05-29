package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Element ");
		int element=sc.nextInt();
		
		List list=new ArrayList();
		list.add(23);
		list.add(56);
		list.add(0,new Integer(element));
		
		//System.out.println(list.get(0));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
