package com.hefshine.myass.controlstatement;

public class AlphabetDigitSpecialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//char ch='>';
	int ch=2;
	
		if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
		{
			System.out.println("It is Alphabet");
		}
		if(ch==0 || ch==1 || ch==2 || ch==3 || ch==4|| ch==5 || ch==6 || ch==7 || ch==8 || ch==9)
		{
			System.out.println("It is Digit");
		}	
		if((ch>=32 && ch<=47)||(ch>=58 && ch<=64)||(ch>=91 && ch<=96)||(ch>=123 && ch<=126))
		{
			System.out.println("It is Special Character");
		}
	}

}
