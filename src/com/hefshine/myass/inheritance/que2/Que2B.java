package com.hefshine.myass.inheritance.que2;


class Multi1{
	private int no1;
	Multi1(){
	}
	Multi1(int no1)
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
class Multi2 extends Multi1{
		public int no2;
		Multi2(){
		}
		Multi2(int no2,int no1)
		{
			super(no1);
			this.no2=no2;
		}
		public int getNo2() {
			return no2;
		}
		public void setNo2(int no2) {
			this.no2 = no2;
		}


}
