package com.hefshine.myass.array.que21;

public class Que21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Priyanka",30000);
		Employee e2=new Employee(2,"Deepa",25000);
		Employee e3=new Employee(3,"Komal",20000);
		Employee e4=new Employee(4,"Shubham",35000);
		Employee e5=new Employee(5,"Snehal",15000);
		
		Employee emp[]=new Employee[5];
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;
		emp[4]=e5;
		
		Decending d=new Decending();
	
			d.Dec(emp);
		
	}

}
