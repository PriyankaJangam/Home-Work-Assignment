package com.hefshine.myass.inheritance.que5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop=new Laptop();
		laptop.setNoOfUSBPort(4);
		laptop.setPreocessorSpeed(8);
		int usbport=laptop.getNoOfUSBPort();
		System.out.println("Number of USB Port "+usbport);
		int processorspeed=laptop.getPreocessorSpeed();
		System.out.println("Processor Speed is "+processorspeed);
		
	}

}
