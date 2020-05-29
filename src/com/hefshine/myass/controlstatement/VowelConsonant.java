//Vowel Consonant
package com.hefshine.myass.controlstatement;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='P';
		if((ch=='a'|| ch=='A') || (ch=='e'|| ch=='E') || (ch=='i'|| ch=='I') || (ch=='o'|| ch=='O') || (ch=='u'|| ch=='U'))
		{
			System.out.println("Character is vowel");
		}
		else{
			System.out.println("Character is Consonant");
		}
	}

}
