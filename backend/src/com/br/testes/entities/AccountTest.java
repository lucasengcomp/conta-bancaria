package com.br.testes.entities;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.br.entities.Account;
import com.br.testes.factory.AccountFactory;

public class AccountTest {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
    	double amount = 200.0;
    	double expectedValue = 196.0;
    	var acc = AccountFactory.createEmptyAccount();
    	
    	acc.deposit(amount);
    	
    	Assertions.assertEquals(expectedValue, acc.getBalance());
    }
    
    @Test
    public void depositShouldDoNothingWhenNegativeAmount() {
    	double expectedValue = 100.0;
    	var acc = AccountFactory.createAccount(expectedValue);
    	double amount = -200.0;
    	acc.deposit(amount);
    	
    	Assertions.assertEquals(expectedValue, acc.getBalance());
    }
}
