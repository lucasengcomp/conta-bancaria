package com.br.entities;

public class MainFinancing {

	public static void main(String[] args) {

		try {
			Financing financing1 = new Financing(100000.0, 2000.0, 20);
			System.out.println("Dados do financiamento 1:");
			System.out.printf("Entrada: %.2f%n", financing1.entry());
			System.out.printf("Prestação: %.2f%n", financing1.quota());
		} catch (IllegalArgumentException e) {
			System.out.println("Erro no financiamento 1: " + e.getMessage());
		}

		try {
			Financing financing2 = new Financing(100000.0, 2000.0, 80);
			System.out.println("Dados do financiamento 2:");
			System.out.printf("Entrada: %.2f%n", financing2.entry());
			System.out.printf("Prestação: %.2f%n", financing2.quota());
		} catch (IllegalArgumentException e) {
			System.out.println("Erro no financiamento 2: " + e.getMessage());
		}
	}
}
