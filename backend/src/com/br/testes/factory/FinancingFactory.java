package com.br.testes.factory;

import com.br.entities.Financing;

public class FinancingFactory {

	public static Financing createFinancingInvalid() {
		return new Financing(100000.0, 2000.0, 20);
	}
	
	public static Financing createFinancingValid() {
		return new Financing(100000.0, 2000.0, 80);
	}
}
