package com.hefshine.myass.collectionqueue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Que3 implements Serializable,Comparable<Que3>{
	private int id;
	private String name;
	private float salary;
	
	public Que3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Que3(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Que3 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public int compareTo(Que3 o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que3 q1=new Que3(1,"Priyanka",40000);
		Que3 q2=new Que3(2,"Abhay",50000);
		Que3 q3=new Que3(3,"Shubham",45000);
		
		Queue q=new PriorityQueue();
		
		q.add(q1);
		q.add(q2);
		q.add(q3);
		
		Enumeration en=Collections.enumeration(q);  
		
		while(en.hasMoreElements())
		{
			Object obj=(Object)en.nextElement();
			System.out.println(obj);
		}
		
	}

	
	
}
