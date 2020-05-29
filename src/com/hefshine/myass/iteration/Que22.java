package com.hefshine.myass.iteration;

public class Que22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=45;
		int no=num*num;
		int count=0,rem=0,part1=0,part2;
		int total=10;
		int temp=no;
		
		while(no>0)
		{
			
			count++;
			
			no=no/10;
			
		}
	
		part1=count/2;
		part2=count-part1;
		
		for(int i=1;i<part2;i++)
		{
			total=total*10;
		}
		
			int sum1=(temp/total);
			
			int sum2=(temp%total);
			
			int sum3=sum1+sum2;
			System.out.println(sum3);
			
			if(num==sum3)
			{
				System.out.println("Number is Kaprekar");
			}
			else{
				System.out.println("Number is not Kaprekar");
			}
			
			
	

	}

}
