package com.br.testes.entities;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

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
    
    @Test
    public void fullWithdrawShouldClearBalanceAndReturnFullBalance() {
    	double expectedValue = 0.0;
    	double initialBalance = 800.0;
    	var acc = AccountFactory.createAccount(initialBalance);
    	var result = acc.fullWithdraw();

    	Assertions.assertTrue(expectedValue == acc.getBalance());
    	Assertions.assertTrue(result == initialBalance);
    }
    
    @Test
    public void withdrawShouldDecreaseBalanceWhenSufficientBalance() {
    	var acc = AccountFactory.createAccount(800.0);
    	
    	acc.withdraw(500.0);
    	
    	Assertions.assertEquals(300.0, acc.getBalance());
    }
    
    @Test
    public void withdrawShouldThrowExceptionBalanceWhenInsufficientBalance() {    	
    	Assertions.assertThrows(IllegalArgumentException.class, () -> {
    		var acc = AccountFactory.createAccount(800.0);
    		acc.withdraw(801.0);
    	});
    }
}
