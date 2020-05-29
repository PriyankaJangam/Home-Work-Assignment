package com.hefshine.myass.string;

import java.util.Scanner;

public class Que19 {
void Palindrome(StringBuffer sb[])
{
	for(int i=0;i<sb.length;i++)
	{
		StringBuffer s=sb[i];
		StringBuffer re=s.reverse();
		if(re==sb[i])
		{
			//System.out.println(s);
			System.out.println("Palindreome "+re);
		}
	}
	
	
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 10 number ");
		StringBuffer sb1=new StringBuffer("ABC");
		StringBuffer sb2=new StringBuffer("ABA");
		StringBuffer sb3=new StringBuffer("ABCD");
		StringBuffer sb4=new StringBuffer("BAB");
		StringBuffer sb5=new StringBuffer("ABCP");
		StringBuffer sb6=new StringBuffer("PQP");
		StringBuffer sb7=new StringBuffer("PPP");
		StringBuffer sb8=new StringBuffer("WQT");
		StringBuffer sb9=new StringBuffer("IOP");
		StringBuffer sb10=new StringBuffer("ABC");
		StringBuffer sb[]=new StringBuffer[10];
		sb[0]=sb1;
		sb[1]=sb2;
		sb[2]=sb3;
		sb[3]=sb4;
		sb[4]=sb5;
		sb[5]=sb6;
		sb[6]=sb7;
		sb[7]=sb8;
		sb[8]=sb9;
		sb[8]=sb10;
		
		Que19 obj=new Que19();
		obj.Palindrome(sb);
		
	}

}
