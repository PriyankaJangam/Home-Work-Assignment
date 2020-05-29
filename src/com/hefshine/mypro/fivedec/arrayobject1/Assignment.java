package com.hefshine.mypro.fivedec.arrayobject1;

import java.io.Serializable;

public class Assignment implements Serializable{

	private int AssId;
	private String Name_Of_Assignment;
	private String Submission_Date;
	private String Completion_Date;
	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Assignment(int assId, String name_Of_Assignment, String submission_Date, String completion_Date) {
		super();
		AssId = assId;
		Name_Of_Assignment = name_Of_Assignment;
		Submission_Date = submission_Date;
		Completion_Date = completion_Date;
	}
	
	public int getAssId() {
		return AssId;
	}
	public void setAssId(int assId) {
		AssId = assId;
	}
	public String getName_Of_Assignment() {
		return Name_Of_Assignment;
	}
	public void setName_Of_Assignment(String name_Of_Assignment) {
		Name_Of_Assignment = name_Of_Assignment;
	}
	public String getSubmission_Date() {
		return Submission_Date;
	}
	public void setSubmission_Date(String submission_Date) {
		Submission_Date = submission_Date;
	}
	public String getCompletion_Date() {
		return Completion_Date;
	}
	public void setCompletion_Date(String completion_Date) {
		Completion_Date = completion_Date;
	}
	@Override
	public String toString() {
		return "Assighnment [AssId=" + AssId + ", Name_Of_Assignment=" + Name_Of_Assignment + ", Submission_Date="
				+ Submission_Date + ", Completion_Date=" + Completion_Date + "]";
	}
	
	
}
