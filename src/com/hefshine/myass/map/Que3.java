package com.hefshine.myass.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map map=new TreeMap();
		map.put(1,"Priyanka");
		map.put(2,"Abhay");
		map.put(3,"Khushal");
		map.put(4,"Shubham");
		
		System.out.println("Enter key to search " );
		int search=sc.nextInt();
		
		if(map.containsKey(search))
		{
			Object obj=map.get(search);
			System.out.println(obj);
		}
		else
		{
			System.out.println("Not in map");
		}
		
	}

}
