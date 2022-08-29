package com.br.testes.entities;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.br.testes.factory.FinancingFactory;

public class FinancingTest {

	@Test
	public void constructorsShouldCreateObjectsValids() {
		
		var financing = FinancingFactory.createFinancingValid();
		
		Assertions.assertEquals(100000.0, financing.getTotalAmount());		
		Assertions.assertEquals(2000.0, financing.getIncome());		
		Assertions.assertEquals(80, financing.getMonths());		
	}
}
