package com.hefshine.mypro.fivedec.arrayobject1;

import java.io.Serializable;

import org.omg.Messaging.SyncScopeHelper;

public class Students implements Serializable{
	private int id;
	private String SName;
	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Students(int id, String sname) {
		super();
		this.id = id;
		SName = sname;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSName() {
		return SName;
	}


	public void setStudent(String sname) {
		SName = sname;
	}

	
	@Override
	public String toString() {
		return "Students [id=" + id + ", Student=" + SName + "]";
	}


	void DoAssignment(Assignment a)
	{
		System.out.println(this.SName+" Do Assignment " + a.getName_Of_Assignment()+" Submission of Date is "+a.getSubmission_Date()+" Completion Date of Assignment "+a.getCompletion_Date());
		
	}
	void DoAssignment(Assignment a,Assignment b)
	{
		System.out.println(this.SName+" Do Assignment1 " + a.getName_Of_Assignment()+"Do Assignment2 "+ b.getName_Of_Assignment()+" Submission of Date of assignment1 "+a.getSubmission_Date()+"Submission of Date of assignment2" +b.getSubmission_Date()+" Completion Date of Assignment1 "+a.getCompletion_Date()+"Completion Date of Assignment2 "+b.getCompletion_Date());
		
	}
	void DoAssignment(Assignment a[])
	{
		for(int i=0;i<a.length;i++)
		{
		System.out.println(this.SName+" Do Assignment " + a[i].getName_Of_Assignment()+" Submission of Date is "+a[i].getSubmission_Date()+" Completion Date of Assignment "+a[i].getCompletion_Date());
	    }
	}
	
	
}
