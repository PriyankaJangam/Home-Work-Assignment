package com.hefshine.myass.collectionsorting;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

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

	@Override
	public int compareTo(Que3 e) {
		if(this.getSalary()==e.getSalary())
		{
			return 0;
		}
		else if(this.getSalary()<e.getSalary())
		{
			return 0;
		}
		else
			return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que3 e1=new Que3(1,"Priyanka",50000);
		Que3 e2=new Que3(2,"Deepa",45000);
		Que3 e3=new Que3(3,"Komal",550000);
		
		List list=new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Collections.sort(list);
		ListIterator itr=list.listIterator();
		while(itr.hasNext())
		{
			Que3 temp=(Que3)itr.next();
			System.out.print(temp.getId()+" ");
			System.out.print(temp.getName()+" ");
			System.out.println(temp.getSalary());
		}
		
	}

	}
	


