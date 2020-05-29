//Profit and Loss
package com.hefshine.myass.controlstatement;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float SP=2000f, CP=1000f;
		float profit,loss;
		if(SP>=CP)
		{
		profit=SP-CP;
		System.out.println("Profit="+profit);
		}
		else
		{
		loss=CP-SP;
		System.out.println("Loss= "+loss);
		}
		
		
	}

}
