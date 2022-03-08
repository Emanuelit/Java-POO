package com.generation.classes;

public class Cliente {

	String nome;
	String metodoDePagamento;
	String produto;
	int idade;
	
	
	void comprar() {
		System.out.println("Efetuando Compra");
	}
	
	void pagar() {
		System.out.println("Pagamento completo");
		
	}
}
