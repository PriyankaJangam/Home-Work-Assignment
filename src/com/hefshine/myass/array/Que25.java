package com.hefshine.myass.array;

public class Que25
{
	int a[]={5,1,3,4,7};
	void demo(){
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			for(int k=i+2;k<a.length;k++)
			{
				
				if(i!=j && i!=k && j!=k)
				{
					int temp=a[i]+a[j]+a[k];
				if(temp<12)
				{
					System.out.print(a[i]+",");
					System.out.print(a[j]+",");
					System.out.print(a[k]);
					System.out.println();
				}
				}
			}
			
		}
		
	}
	}
	public static void main(String[] args) {
		Que25 obj=new Que25();
		obj.demo();
	}
}
