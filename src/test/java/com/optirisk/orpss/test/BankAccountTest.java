package com.optirisk.orpss.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.optirisk.orpss.e2e.BankAccount;

public class BankAccountTest {

   @Test
   public void addCreditTest() {
	   
	  BankAccount myAccount = new BankAccount("Neelakandan",1234567890);  	  
	  
      assertEquals("Amount Credited",myAccount.creditAmount(1000));
   }
   
   @Test
   public void debitCreditTest() {
	   
	  BankAccount myAccount = new BankAccount("Neelakandan",1234567890);  	  
	  
      assertEquals("Insufficient Balance",myAccount.debitAmount(500));
   }
}
