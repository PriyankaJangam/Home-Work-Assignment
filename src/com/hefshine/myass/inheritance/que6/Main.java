package com.hefshine.myass.inheritance.que6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSK csk1=new CSK(1,"Priyanka");
		RCB rcb1=new RCB(1,"Deepa");
		int cid=csk1.getC_IDPlayer();
		System.out.println("Player id "+cid);
		String cname=csk1.getC_PName();
		System.out.println("Player Name "+cname);
		csk1.play();
		int rid=rcb1.getR_IDPlayer();
		System.out.println("Player id "+rid);
		String rname=rcb1.getR_PName();
		System.out.println("Player Name "+rname);
		rcb1.play();
		rcb1.play();
	}

}
