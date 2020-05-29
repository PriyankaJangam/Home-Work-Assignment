package com.hefshine.myass.inheritance.que7;

class KidBook {
	int BId;
	String Book;
	
	void readBook()
	{
		System.out.println("Parent Class Read Book");
	}
	void readBook(int BId,String Book)
	{
		System.out.println("Book ID "+BId);
		System.out.println("Book Name "+Book);
	}
}
class BigKidBook extends KidBook{
	
	void readBook(int BId,String Book)
	{
		System.out.println("Book ID "+BId);
		System.out.println("Book Name "+Book);
		
	}
	
}