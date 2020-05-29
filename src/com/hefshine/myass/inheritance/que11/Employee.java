package com.hefshine.myass.inheritance.que11;

import java.io.Serializable;

public class Employee implements Serializable {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50; 
	float BSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,float BSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.BSalary=BSalary;
	}
	
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public double getHra() {
		return Hra;
	}

	public void setHra(double hra) {
		Hra = hra;
	}

	void calculateSalary()
	{
		double salary=this.BSalary+(this.BSalary*this.specialAllowance/100)+(this.BSalary*this.Hra/100);
		System.out.println("Salary of Employee "+salary);
	}
	void calculateTransportAllowance()
	{
		float TA=this.BSalary*10/100;
		System.out.println("Employee TA "+TA);
	}
	
}
