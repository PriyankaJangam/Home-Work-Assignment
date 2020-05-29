package com.hefshine.myass.array.que12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Priyanka",30000.0f);
		Employee e2=new Employee(2,"Deepa",25000.0f);
		Employee e3=new Employee(3,"Mahendra",25000.0f);
		Employee e4=new Employee(4,"Shubham",24000.0f);
		
		Employee emp[]=new Employee[4];
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;
		
		for(int i=0;i<emp.length-1;i++)
		{
			for(int j=1;j<emp.length;j++)
			{
				if(i==j)
				{
					break;
				}
			
			if(emp[i].getSalary()==emp[j].getSalary())
			{
				emp[i].show(emp);
				emp[j].show(emp);
				break;
			}
			}
		}
	}

}
