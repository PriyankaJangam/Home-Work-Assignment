package com.hefshine.myass.map.que13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Main {

	public static void main(String[] args) {
		Student s1=new Student(107,"Priyanka",79.0f);
		Student s2=new Student(204,"Abhay",87.0f);
		Student s3=new Student(189,"Shubham",90.0f);		
		Scanner sc=new Scanner(System.in);
		
		
		StudId sid=new StudId();
		
		TreeMap map=new TreeMap(sid);
		map.put(s1,"Hefshine");
		map.put(s2,"Hefshine");
		map.put(s3,"Hefshine");
		
		Set s=map.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			Map.Entry me=(Map.Entry)obj;
			System.out.println(me.getKey());
			//System.out.println(me.getValue());
		}
		

	}

}
