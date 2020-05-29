package com.hefshine.myass.collectionsorting;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class Que1 implements Serializable,Comparable<Que1>{
	private int id;
	private String name;
	private float salary;
	
	public Que1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Que1(int id, String name, float salary) {
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
		return "Que1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Que1 e) {
		if(this.getSalary()==e.getSalary())
		{
			return 1;
		}
		else if(this.getSalary()<e.getSalary())
		{
			return 1;
		}
		else
			return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que1 e1=new Que1(1,"Priyanka",50000);
		Que1 e2=new Que1(2,"Deepa",45000);
		Que1 e3=new Que1(3,"Komal",550000);
		
		List list=new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Collections.sort(list);
		ListIterator itr=list.listIterator();
		while(itr.hasNext())
		{
			Que1 temp=(Que1)itr.next();
			System.out.print(temp.getId()+" ");
			System.out.print(temp.getName()+" ");
			System.out.println(temp.getSalary());
		}
		
	}

	
}
