package com.optirisk.orpss.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.optirisk.orpss.e2e.BankAccount;

public class BankAccountTest {

   @Test
   public void testAdd() {
	   
	  BankAccount myAccount = new BankAccount("Neelakandan",1234567890);
	  
	  myAccount.creditAmount(1000);
	  
      assertEquals(1000,myAccount.getActBalance());
   }
}
