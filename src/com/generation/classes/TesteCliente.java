package com.generation.classes;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.nome = "Jo�o";
		c1.idade = 20;
		c1.metodoDePagamento = "Cart�o de Cr�dito";
		c1.produto = "Televis�o";
		
		System.out.println(c1.nome);
		System.out.println(c1.idade);
		System.out.println(c1.metodoDePagamento);
		System.out.println(c1.produto);
		System.out.println();
		c1.comprar();
		c1.pagar();
		System.out.println();
		
		c2.nome = "Marcela";
		c2.idade = 35;
		c2.metodoDePagamento = "Cart�o de D�bito";
		c2.produto = "Geladeira";
		
		System.out.println(c2.nome);
		System.out.println(c2.idade);
		System.out.println(c2.metodoDePagamento);
		System.out.println(c2.produto);
		System.out.println();
		c2.comprar();
		c2.pagar();
		System.out.println();
		
		
		
	}

}
