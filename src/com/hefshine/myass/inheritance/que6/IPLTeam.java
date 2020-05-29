package com.hefshine.myass.inheritance.que6;

class IPLTeam {
	private int Number=0; 
	void play()
	{
		Number=Number+1;
		System.out.println("Player play Cricket  "+Number+" Times");
	}
	
}
class CSK extends IPLTeam{
	private int C_IDPlayer;
	private String C_PName;

	public CSK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CSK(int c_IDPlayer, String c_PName) {
		super();
		C_IDPlayer = c_IDPlayer;
		C_PName = c_PName;
		
	}
	public int getC_IDPlayer() {
		return C_IDPlayer;
	}
	public void setC_IDPlayer(int c_IDPlayer) {
		C_IDPlayer = c_IDPlayer;
	}
	public String getC_PName() {
		return C_PName;
	}
	public void setC_PName(String c_PName) {
		C_PName = c_PName;
	}
	@Override
	public String toString() {
		return "CSK [C_IDPlayer=" + C_IDPlayer + ", C_PName=" + C_PName + "]";
	}
	
	
}
class RCB extends IPLTeam{
	private int R_IDPlayer;
	private String R_PName;
	
	public RCB() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RCB(int r_IDPlayer, String r_PName) {
		super();
		R_IDPlayer = r_IDPlayer;
		R_PName = r_PName;
		
	}
	public int getR_IDPlayer() {
		return R_IDPlayer;
	}
	public void setR_IDPlayer(int r_IDPlayer) {
		R_IDPlayer = r_IDPlayer;
	}
	public String getR_PName() {
		return R_PName;
	}
	public void setR_PName(String r_PName) {
		R_PName = r_PName;
	}
	@Override
	public String toString() {
		return "RCB [R_IDPlayer=" + R_IDPlayer + ", R_PName=" + R_PName + "]";
	}
	
	
}