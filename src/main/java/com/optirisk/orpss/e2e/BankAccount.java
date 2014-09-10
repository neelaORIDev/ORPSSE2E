package com.optirisk.orpss.e2e;

public class BankAccount {

	private String actHolderName = null;
	private long actNumber = 0L;
	private float actBalance = 0;
	
	public BankAccount(String actHolderName, long actNumber){
		this.actBalance = 0;
		this.actHolderName = actHolderName;
		this.actNumber = actNumber;
	}
	
	public String creditAmount(float inAmount){
		this.actBalance += inAmount;
		System.out.println("Amount "+inAmount+" has been added to your main balance;"
				+ " Current Account Balance is "+this.actBalance);
		
		return "Amount Credited";
	}
	
	public String debitAmount(float inAmount){
		
		if(inAmount > this.actBalance){
			
			System.out.println("In-sufficient Balance");
			return "Insufficient Balance";
		}
		
		System.out.println("Your Current Balance: "+this.actBalance);
		this.actBalance -= inAmount;
		System.out.println("Your Current Balance After Debited Amount "+inAmount+" : "+this.actBalance);
		return "Amount Debited";
	}

	/**
	 * @return the actHolderName
	 */
	public String getActHolderName() {
		return actHolderName;
	}

	/**
	 * @param actHolderName the actHolderName to set
	 */
	public void setActHolderName(String actHolderName) {
		this.actHolderName = actHolderName;
	}

	/**
	 * @return the actNumber
	 */
	public long getActNumber() {
		return actNumber;
	}

	/**
	 * @param actNumber the actNumber to set
	 */
	public void setActNumber(long actNumber) {
		this.actNumber = actNumber;
	}

	/**
	 * @return the actBalance
	 */
	public float getActBalance() {
		return actBalance;
	}

	/**
	 * @param actBalance the actBalance to set
	 */
	public void setActBalance(float actBalance) {
		this.actBalance = actBalance;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankAccount [actHolderName=" + actHolderName + ", actNumber="
				+ actNumber + ", actBalance=" + actBalance + "]";
	}	
}
