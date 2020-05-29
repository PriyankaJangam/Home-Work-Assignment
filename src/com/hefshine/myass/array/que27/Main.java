package com.hefshine.myass.array.que27;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(101,"Core Java","Balgureu Swami",400.0f);
		Book b2=new Book(102,"Advance Java","Balgureu Swami",600.0f);
		Book b3=new Book(103,"Angular JS","Ramkrishna Swami",300.0f);
		
		Book book[]=new Book[3];
		book[0]=b1;
		book[1]=b2;
		book[2]=b3;
		
		for(int i=0;i<book.length;i++)
		{
			System.out.println(" Available Book ");
			System.out.println(book[i].getBId());
			System.out.println(book[i].getBName());
			System.out.println(book[i].getAuthour());
			System.out.println(book[i].getPrice());
		}
		Student s1=new Student(1,"Priyanka");
		Student s2=new Student(2,"Deepa");
		Student s3=new Student(3,"Komal");
		
		Student student[]=new Student[3];
		student[0]=s1;
		student[1]=s2;
		student[2]=s3;
		
		for(int i=0;i<student.length;i++)
		{
		  student[i].ReadingBook(book);
		}
		
		
	}

}
