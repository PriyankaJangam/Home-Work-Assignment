package com.hefshine.myass.InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Que6 {

	public static void main(String[] args) {

		String lw=" ";
		String current;
		
		Scanner sc=new Scanner(System.in);
		try {
			sc = new Scanner(new File("h:\\abc.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(sc.hasNext())
		{
			current=sc.next();
			
			if(current.length()>lw.length())
			{
				lw=current;
			}
		}
		System.out.println(lw);
	}

}
