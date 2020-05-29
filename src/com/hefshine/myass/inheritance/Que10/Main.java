package com.hefshine.myass.inheritance.Que10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Priyanka","Manager",2.5f,2.0f,30000.0f);
		Manager m=new Manager();
		m.BSalary(e1);
		Employee e2=new Employee(2,"Deepa","Trainer",2.5f,2.0f,30000.0f);
		Trainer t=new Trainer();
		t.BSalary(e2);
	}

}
