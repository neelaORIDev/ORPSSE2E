package com.optirisk.orpss.e2e;

public class BankAccount {

	private double actBalance = 0;
	
	public BankAccount(double myBalance){
		this.actBalance = myBalance;
	}
	
	public void debitBalance(double inAmount){
		
		if(inAmount > this.actBalance){
			
			System.out.println("In-sufficient Balance");
			return;
		}
		
		System.out.println("Your Current Balance: "+this.actBalance);
		this.actBalance -= inAmount;
		System.out.println("Your Current Balance After Debited Amount "+inAmount+" : "+this.actBalance);
		
	}
}
