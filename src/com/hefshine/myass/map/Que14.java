package com.hefshine.myass.map;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Que14 implements Serializable,Comparable<Que14>{
	private int Roll_No;
	private String Name;
	private float Marks;
	
	public Que14() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Que14(int roll_No, String name, float marks) {
		super();
		Roll_No = roll_No;
		Name = name;
		Marks = marks;
	}
	

	public int getRoll_No() {
		return Roll_No;
	}


	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public float getMarks() {
		return Marks;
	}


	public void setMarks(float marks) {
		Marks = marks;
	}
	

	@Override
	public String toString() {
		return "Que14 [Roll_No=" + Roll_No + ", Name=" + Name + ", Marks=" + Marks + "]";
	}

	public int compareTo(Que14 o) {
		// TODO Auto-generated method stub
		if(this.getMarks()==o.getMarks())
			return 0;
		else if(o.getMarks()<35)
			return -1;
		else
			return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que14 q1=new Que14(1,"Priyanka",79.0f);
		Que14 q2=new Que14(2,"Abhay",34.0f);
		Que14 q3=new Que14(3,"Khushal",89.0f);
		Que14 q4=new Que14(4,"Shubham",56.0f);
		
		Map map=new HashMap();
		map.put(q1,q1.getMarks());
		map.put(q2, q2.getMarks());
		map.put(q3,q3.getMarks());
		map.put(q4, q4.getMarks());
		
		Set s=map.entrySet();
		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList();
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Object obj=itr.next();
			Map.Entry me=(Map.Entry)obj;
			Que14 temp=(Que14)me.getKey();
			if(temp.getMarks()>35)
			{
				
				a1.add(temp);
			
			}
			else
			{
				
				a2.add(temp);
				
			
				
			}
		}
		System.out.println("Student Pass");
		System.out.println(a1);
		System.out.println("Student fail");
		System.out.println(a2);
	}


	
}
