//Enter 5 subject marks
package com.hefshine.myass.basicofjava;

public class FiveSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 5 Subject marks");
		int s1=78,s2=72,s3=98,s4=89,s5=69;
		float total,per,avg;
		total=s1+s2+s3+s4+s5;
		System.out.println("Sum of Subject:"+total);
		per=total/5;
		System.out.println("Percentage of Student:"+per);
		
		if(per>70)
		{
			System.out.println("Distinction");
		}
		else if(per>60)
		{
			System.out.println("First Class");
		}
		else if(per>50)
		{
			System.out.println("Second Class");
		}
		else if(per>40)
		{
			System.out.println("Third Class");
		}
		else{
			System.out.println("fail");
		}
	}

}
