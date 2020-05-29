package com.hefshine.myass.map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Que11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeMap map=new TreeMap();
		map.put(8,"Priyanka");
		map.put(2,"Abhay");
		map.put(3,"Khushal");
		map.put(4,"Shubham");
		
		System.out.println("Enter Key ");
		int key=sc.nextInt();
		System.out.print("Associated Lowest Key "+map.lowerEntry(key)+" ");
		System.out.println(map.lowerKey(key));
		System.out.println("Associated higher Key "+map.higherEntry(key));
		System.out.println(map.higherKey(key));
	
	}

}
