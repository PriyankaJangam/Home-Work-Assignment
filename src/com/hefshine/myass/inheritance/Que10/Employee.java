package com.hefshine.myass.inheritance.Que10;

class Employee {
	private int id;
	private String name;
	private String designation;
	private float hra;
	private float da;
	private float salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, String designation, float hra, float da, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.hra = hra;
		this.da = da;
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
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	public float getDa() {
		return da;
	}
	public void setDa(float da) {
		this.da = da;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
class Manager extends Employee
{
	float netSalary=0.0f;
	
	void BSalary(Employee e)
	{
		float TA=e.getSalary()*15/100;
		netSalary=e.getHra()+e.getDa()+e.getSalary()+TA;
		System.out.println(e.getName()+" is a "+e.getDesignation());
		System.out.println("Salary of "+e.getName()+" is " +netSalary);
		
	}
}
class Trainer extends Employee
{
float netSalary=0.0f;
	
	void BSalary(Employee e)
	{
		float TA=e.getSalary()*10/100;
		netSalary=e.getHra()+e.getDa()+e.getSalary()+TA;
		System.out.println(e.getName()+" is a "+e.getDesignation());
		System.out.println("Salary of "+e.getName()+" is " +netSalary);
		
	}
}