package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		List list=new ArrayList();
		list.add(23);
		list.add(56);
		list.add(76);
		list.add(98);
		
		System.out.println("Enter Index value ");
		int index=sc.nextInt();
		
		list.remove(index);
	
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
