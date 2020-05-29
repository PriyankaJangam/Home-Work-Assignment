package com.hefshine.mypro.fivedec.arrayobject1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment assignment1=new Assignment(101,"OOPS","4/1/2019","2/1/2019");
		Assignment assignment2=new Assignment(102,"Method","6/1/2019","3/1/2019");
		Assignment assignment3=new Assignment(103,"Constructor","8/1/2019","4/1/2019");
		
		Assignment ass[]=new Assignment[3];
	    ass[0]=assignment1;
	    ass[1]=assignment2;
	    ass[2]=assignment3;
	    
	    for(int i=0;i<ass.length;i++)
	    {
	    	System.out.println("===Assignment List===");
	    	System.out.println(ass[i].getName_Of_Assignment());
	    	System.out.println(ass[i].getSubmission_Date());
	    	System.out.println(ass[i].getCompletion_Date());
	    }
	    
		Students student1=new Students(1,"Priyanka");
		Students student2=new Students(2,"Deepa");
		
		Students stud[]=new Students[2];
		stud[0]=student1;
		stud[1]=student2;
		
		student1.DoAssignment(assignment1);
		student2.DoAssignment(assignment1,assignment2);
		
		for(int i=0;i<stud.length;i++)
		{
			stud[i].DoAssignment(ass);
		}
	}

}
