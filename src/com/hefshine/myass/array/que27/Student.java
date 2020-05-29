package com.hefshine.myass.array.que27;

import java.io.Serializable;

public class Student implements Serializable{
	private int Sid;
	private String SName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sName) {
		super();
		Sid = sid;
		SName = sName;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", SName=" + SName + "]";
	}
	void ReadingBook(Book book[])
	{
		for(int i=0;i<book.length;i++)
		{
		System.out.println("===========");
		System.out.println(this.SName+" Read Book "+book[i].getBName()+" Author Name of Book is "+book[i].getAuthour()+" Price of Book is "+book[i].getPrice());
	
		}
	}
		
	
}
