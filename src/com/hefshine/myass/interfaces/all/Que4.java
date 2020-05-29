package com.hefshine.myass.interfaces.all;



class Parent1{
	private int no1;
	Parent1(){
	}
	Parent1(int no1)
	{
		this.no1=no1;
	}
	public int getNo1() {
		return no1;
	}
	public void setNo1(int no1) {
		this.no1 = no1;
	}
}	
class Chil extends Parent1{
		public int no2;
		int no1;
		Chil(){
		}
		Chil(int no2,int no1)
		{
			super(no1);
			this.no2=no2;
			this.no1=no2;
		}
		public int getNo2() {
			return no2;
		}
		public void setNo2(int no2) {
			this.no2 = no2;
		}
		void add(){
			System.out.println("Addition "+this.no1+this.no2);
		}

}
public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chil chil=new Chil(2,3);
		System.out.println(chil.getNo1());
		System.out.println(chil.getNo2());
		chil.add();
	}

}
