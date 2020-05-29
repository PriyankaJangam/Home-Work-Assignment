package com.hefshine.myass.inheritance.que11;

public class TrainersActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(1,"Priyanka","Chalisgaon",7972985348l,30000);
		e.calculateSalary();
		e.calculateTransportAllowance();
		Manager m=new Manager(2,"Deepa","Pune",8912457897l,40000);
		m.calculateTransportAllowance();
		Trainee t=new Trainee(3,"Komal","Mumbai",9845127834l,25000);
		m.calculateTransportAllowance();
		
	}

}
