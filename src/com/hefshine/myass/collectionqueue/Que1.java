package com.hefshine.myass.collectionqueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new PriorityQueue();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		Iterator itr=q.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			System.out.println(i);
		}
		
	}

}
