package com.hefshine.myass.containment.que1;

public class FullName {
	private String firstname;
	private String middlename;
	private String lastname;
	Address address;
	
	public FullName() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FullName(String firstname, String middlename, String lastname,Address address) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.address=address;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "FullName [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
				+ ", address=" + address + "]";
	}
	
	
	
}
