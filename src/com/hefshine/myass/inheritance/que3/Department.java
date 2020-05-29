package com.hefshine.myass.inheritance.que3;
import java.io.Serializable;

class Department implements Serializable{
	private int id;
	private String Name;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", Name=" + Name + "]";
	}
	
	
}
