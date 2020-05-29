package com.hefshine.myass.inheritance.que11;

public class Manager extends Employee{

	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
	}
	void calculateTransportAllowance()
	{
		double TA=this.basicSalary*15/100;
		System.out.println("Employee TA "+TA);
	}
	
}
