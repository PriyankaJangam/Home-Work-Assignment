package com.hefshine.myass.iteration;

public class Que10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu="prime";
			switch(menu)
			{
			case "even":System.out.println("Even Number");
			for(int i=1;i<=100;i++)
			{
				
				if(i%2==0)
				{
					System.out.println("Even Number"+i);
				}
			}
			break;
			
			case "odd":System.out.println("Odd Number");
			for(int i=1;i<=100;i++)
			{
				
				if(i%2!=0)
				{
					System.out.println("odd Number"+i);
				}
			}
			break;
		
			case "prime":System.out.println("Prime Number");
			
			for(int i=1;i<=100;i++)
				{
					int count=0;
					for(int j=1;j<=i;j++)
					{
						if(i%j==0)
						{
							count++;	
						}
						
					}
			
					if(count==2)
					{
						System.out.println("Prime Number "+i);
					}
			
				}
			break;
			
			
				
			
		}
	}

}
