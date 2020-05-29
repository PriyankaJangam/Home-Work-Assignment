package com.hefshine.myass.array.que21;

public class Decending {
	void Dec(Employee emp[])
	{
		for(int i=0;i<emp.length;i++)
		{
			for(int j=i+1;j<emp.length-1;j++)
			{
				if(emp[i].getSalary()<emp[j].getSalary())
				{
					Employee temp = emp[i];
					emp[i] = emp[j];
					emp[j]=temp;
				}
			}
		}
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
			
		}
	}
}
