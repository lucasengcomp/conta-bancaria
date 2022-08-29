package com.br.testes.entities;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.br.entities.Account;

public class AccountTest {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
    	double amount = 200.0;
    	double expectedValue = 196.0;
    	var acc = new Account(1L, 0.0);
    	
    	acc.deposit(amount);
    	
    	Assertions.assertEquals(expectedValue, acc.getBalance());
    }
    
    @Test
    public void depositShouldDoNothingWhenNegativeAmount() {
    	double expectedValue = 100.0;
    	var acc = new Account(1L, expectedValue);
    	double amount = -200.0;
    	acc.deposit(amount);
    	
    	Assertions.assertEquals(expectedValue, acc.getBalance());
    }
}
