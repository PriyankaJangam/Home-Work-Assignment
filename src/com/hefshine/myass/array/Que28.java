package com.hefshine.myass.array;

public class Que28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,3,8,1,-4,89,22,71,42,22};
		
		int start=3;
		int end=22;
		int count=1;
	
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==start)
			{
				for(int j=start;j<a.length;j++)
				{
					
					count++;
					if(a[j]==end)
					{
						break;
					}
				}
				break;
			}
		}
		System.out.println(count);
	}

}
