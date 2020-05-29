package com.hefshine.myass.sixdec;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,56,-2,0,45,120,90};
		int temp=0;
		int index=0;
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			temp=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>temp)
				{
					temp=a[j];
					index=j;
				}
			}
			if(a[i]<temp)
			{
				t=a[i];
				a[i]=a[index];
				a[index]=t;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
		}
				
	}

}
