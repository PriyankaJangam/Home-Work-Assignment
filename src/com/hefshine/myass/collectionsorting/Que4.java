package com.hefshine.myass.collectionsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list =new LinkedList();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		
		/*System.out.println("Reverse of array using reverse Method ");
		Collections.reverse(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			System.out.println(i);
		}
		*/
		System.out.println("Reverse of array using ListLiterator ");
		Iterator itr1=list.descendingIterator();
		while(itr1.hasNext())
		{
			Integer i=(Integer)itr1.next();
			System.out.println(i);
		}
	}
	

}
