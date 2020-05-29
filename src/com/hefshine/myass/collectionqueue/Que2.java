package com.hefshine.myass.collectionqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Queue q=new PriorityQueue();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		System.out.println("Top Element of Queue"+q.peek());
		
	}

}
