package com.hefshine.myass.collectionset;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
	
	public class Que17 implements Serializable{
	private int id;
	private String name;
	private float salary;
	
		public Que17() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Que17(int id, String name, float salary) {
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
		return "Que17 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que17 q1=new Que17(1,"Priyanka",50000);
		Que17 q2=new Que17(2,"Abhay",45000);
		Que17 q3=new Que17(3,"Shubham",40000);
		
		Set set=new HashSet();
		set.add(q1);
		set.add(q2);
		set.add(q3);
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
	}

}
