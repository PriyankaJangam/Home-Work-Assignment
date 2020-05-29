package com.hefshine.myass.InputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Que5 {
	public void write(String s,File f) throws IOException
	{
		
		FileWriter fw=new FileWriter(f,true);
		fw.write(s);
		fw.close();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que5 q5=new Que5();
		File file=new File("h:\\abc.txt");
		try {
			q5.write("Text here", file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
