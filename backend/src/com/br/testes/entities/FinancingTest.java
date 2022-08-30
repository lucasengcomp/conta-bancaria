package com.br.testes.entities;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.br.testes.factory.FinancingFactory;

public class FinancingTest {

	@Test
	public void constructorShouldCreateDataValid() {
		var financing = FinancingFactory.createFinancingValid();

		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}

	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			FinancingFactory.createFinancingInvalid();
		});
	}
	
	@Test
	public void setTotalAmountShouldSetWhenDataValid() {
		var financing = FinancingFactory.createFinancingValid();
		financing.setTotalAmount(90000.0);

		Assertions.assertEquals(90000.0, financing.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var financing = FinancingFactory.createFinancingValid();
			financing.setTotalAmount(110000.0);
		});
	}
	
	@Test
	public void setIncomeShouldSetWhenDataValid() {
		var financing = FinancingFactory.createFinancingValid();
		financing.setIncome(2100.0);

		Assertions.assertEquals(2100.0, financing.getIncome());
	}

	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var financing = FinancingFactory.createFinancingValid();
			financing.setIncome(1900.0);
		});
	}
}
