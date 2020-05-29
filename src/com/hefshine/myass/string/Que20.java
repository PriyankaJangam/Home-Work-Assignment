package com.hefshine.myass.string;

public class Que20 {

	public static void main(String[] args) {
		String s1="welcome to java world";
		//String s2="priti raosaheb satre";
		System.out.println("Given String=>"+s1);
		System.out.println("Character at 5th position =>"+s1.charAt(5));
		System.out.println("Ignoring case difference is=>"+s1.compareToIgnoreCase("WELCOME"));
		System.out.println("After Concating =>"+s1.concat(" Let us learn"));
		System.out.println("first occurances of a =>"+s1.indexOf('a'));
		System.out.println("Replace all occurances of 'a' with 'e'=>"+s1.replace('a', 'e'));
		System.out.println("Substring from 4 to 10 position=> "+s1.substring(4, 10));
	}

}
