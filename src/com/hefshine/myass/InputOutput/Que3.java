package com.hefshine.myass.InputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String from user");
		String s=sc.next();
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		
		try {
			fos =new FileOutputStream("h:\\abc.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
