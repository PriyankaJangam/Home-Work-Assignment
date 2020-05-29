package com.hefshine.myass.string;

import java.util.Scanner;

public class Que22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String 1 ");
		StringBuilder sb=new StringBuilder(sc.next().toString());
		System.out.println("Enter String 2 ");
		StringBuilder sb1=new StringBuilder(sc.next().toString());
		System.out.println("Append String :");
		sb.append(sb1);
		System.out.println(sb);
		System.out.println("Reverse String :");
		sb.reverse();
		System.out.println(sb);
		System.out.println("Insert String :");
		System.out.println("Enter String 3 ");
		StringBuilder sb2=new StringBuilder(sc.next().toString());
		System.out.println("Enter String 4 ");
		StringBuilder sb3=new StringBuilder(sc.next().toString());
		sb2.insert(3, sb3);
		System.out.println(sb2);
		System.out.println("Delete String :");
		sb2.delete(3, 4);
		System.out.println(sb2);
	}

}
