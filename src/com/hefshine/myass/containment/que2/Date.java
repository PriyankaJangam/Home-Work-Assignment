package com.hefshine.myass.containment.que2;

import java.io.Serializable;

public class Date implements Serializable{
	private String Day;
	private String Month;
	private String Year;
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date(String day, String month, String year) {
		super();
		Day = day;
		Month = month;
		Year = year;
	}
	public String getDay() {
		return Day;
	}
	public void setDay(String day) {
		Day = day;
	}
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	@Override
	public String toString() {
		return "Date [Day=" + Day + ", Month=" + Month + ", Year=" + Year + "]";
	}
	
	
}
