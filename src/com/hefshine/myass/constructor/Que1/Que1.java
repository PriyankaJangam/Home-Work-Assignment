package com.hefshine.myass.constructor.Que1;

 class Employee{
	 private int id;
	 private String name;
	 private String designation;
	 private float salary;
	 private float hra;
	 private float da;
	 private float gsalary;
	 
	 Employee()
	 {
		 System.out.println("Default Constructor");
	 }

	public Employee(int id, String name, String designation, float salary, float hra, float da) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.hra = hra;
		this.da = da;
		
	}
	void display()
	{
		System.out.println("Id of Employee "+this.id);
		System.out.println("Name of Employee "+this.name);
		System.out.println("Designation of Employee "+this.designation);
		System.out.println("salary of Employee "+this.salary);
		System.out.println("HRA of Employee "+this.hra);
		System.out.println("DA of Employee "+this.da);
	}
	float Cal()
	{
		gsalary=this.salary+this.hra+this.da;
		return gsalary;
	}
	 
}
