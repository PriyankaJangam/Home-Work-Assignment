package com.hefshine.myass.array.que20;

public class HighestMarks {
	void Search(Student1 stud[])
	{
		float high=stud[0].Marks;
		for(int i=0;i<stud.length;i++)
		{
			if(high<stud[i].Marks)
			{
				high=stud[i].Marks;
			}
		}
		System.out.println(high);
		
	}
}
