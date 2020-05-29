package com.hefshine.myass.collectionset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Que15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet set=new LinkedHashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);


		LinkedList list=new LinkedList(set);
		System.out.println("First Element "+list.getFirst());
		System.out.println("Last Element "+list.getLast());
	}

}
