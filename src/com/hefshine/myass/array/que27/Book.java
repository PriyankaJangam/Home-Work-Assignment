package com.hefshine.myass.array.que27;

import java.io.Serializable;

public class Book implements Serializable{
	private int BId;
	private String BName;
	private String Authour;
	private float Price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bId, String bName, String authour, float Price) {
		super();
		BId = bId;
		BName = bName;
		Authour = authour;
		this.Price = Price;
	}
	public int getBId() {
		return BId;
	}
	public void setBId(int bId) {
		BId = bId;
	}
	public String getBName() {
		return BName;
	}
	public void setBName(String bName) {
		BName = bName;
	}
	public String getAuthour() {
		return Authour;
	}
	public void setAuthour(String authour) {
		Authour = authour;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float Price) {
		this.Price = Price;
	}
	@Override
	public String toString() {
		return "Book [BId=" + BId + ", BName=" + BName + ", Authour=" + Authour + ", Price=" + Price + "]";
	}
	
	
}
