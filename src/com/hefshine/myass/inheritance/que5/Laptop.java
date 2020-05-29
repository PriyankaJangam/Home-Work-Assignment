package com.hefshine.myass.inheritance.que5;

import java.io.Serializable;

public class Laptop implements Serializable{

	private int noOfUSBPort;
	private int preocessorSpeed;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}
	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}
	public int getPreocessorSpeed() {
		return preocessorSpeed;
	}
	public void setPreocessorSpeed(int preocessorSpeed) {
		this.preocessorSpeed = preocessorSpeed;
	}
	
	
	
}
