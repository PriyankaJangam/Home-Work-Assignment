package com.hefshine.myass.array.que20;

	public class Que20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(1,"Priyanka",79.0f);
		Student1 s2=new Student1(2,"Deepa",71.0f);
		Student1 s3=new Student1(3,"Komal",75.0f);
		Student1 s4=new Student1(4,"Mahendra",81.8f);
		Student1 s5=new Student1(5,"Shubham",72.0f);
		Student1 s6=new Student1(6,"Shrutika",77.0f);
		Student1 s7=new Student1(7,"Jaya",68.0f);
		Student1 s8=new Student1(8,"Snehal",79.0f);
		Student1 s9=new Student1(9,"Kavita",74.0f);
		Student1 s10=new Student1(10,"Shweta",70.0f);
		
		Student1 stud[]=new Student1[10];
		stud[0]=s1;
		stud[1]=s2;
		stud[2]=s3;
		stud[3]=s4;
		stud[4]=s5;
		stud[5]=s6;
		stud[6]=s7;
		stud[7]=s8;
		stud[8]=s9;
		stud[9]=s10;
		
		HighestMarks high=new HighestMarks();
		
		  high.Search(stud);
		
		
	}

}
