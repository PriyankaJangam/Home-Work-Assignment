package com.hefshine.myass.InputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Que2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("h:\\abc.txt");
		FileReader fr=null;
		String s;
		try {
			fr=new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br =new BufferedReader(fr);
		try
		{
			while((s=br.readLine()) !=null)
				System.out.println(s);

		}
		catch(IOException e)
		{
			e.printStackTrace();	
		}
	}

}
