package com.generation.classes;

public class TesteProdutoEletrônico {

	public static void main(String[] args) {
		ProdutoEletrônico pe1 = new ProdutoEletrônico();
		ProdutoEletrônico pe2 = new ProdutoEletrônico();
		
		pe1.aparelho = "Celular";
		pe1.marca = "Xiaomi";
		pe1.ano = 2014;
		
		System.out.println(pe1.aparelho);
		System.out.println(pe1.marca);
		System.out.println(pe1.ano);
		System.out.println();
		pe1.ligar();
		pe1.desligar();
		System.out.println();

		pe2.aparelho = "Vídeogame";
		pe2.marca = "Playstation 5";
		pe2.ano = 2020;
		
		System.out.println(pe2.aparelho);
		System.out.println(pe2.marca);
		System.out.println(pe2.ano);
		System.out.println();
		pe1.ligar();
		pe1.desligar();
		System.out.println();
		
		
		
	}

}
