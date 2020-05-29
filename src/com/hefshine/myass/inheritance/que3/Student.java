package com.hefshine.myass.inheritance.que3;

public class Student extends Department {
	private int rollno;
	private String sname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String sname ,Department d1) {
		super(d1.getId(),d1.getName());
		this.rollno = rollno;
		this.sname = sname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + "]";
	}
	
	
	
	
}
