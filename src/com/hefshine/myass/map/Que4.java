package com.hefshine.myass.map;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Map map=new TreeMap();
		map.put(1,"Priyanka");
		map.put(2,"Abhay");
		map.put(3,"Khushal");
		map.put(4,"Shubham");
		
		System.out.println("Enter value to search " );
		String search=sc.nextLine();
		
		if(map.containsValue(search))
		{
			System.out.println("Value "+search+" is in Map");
		}
		else
		{
			System.out.println("Not in map");
		}
	}

}
