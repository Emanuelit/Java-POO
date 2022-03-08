package com.generation.classes;

public class TestePatinete {

	public static void main(String[] args) {
		Patinete p1 = new Patinete();
		Patinete p2 = new Patinete();
		
		p1.marca = "Patinete Elétrico";
		p1.valor = 20.000;
		p1.ano = 2000;
		
		System.out.println(p1.marca);
		System.out.println(p1.valor);
		System.out.println(p1.ano);
		System.out.println();
		p1.dirigir();
		p1.estacionar();
		System.out.println();
		
		p2.marca = "Scooter";
		p2.valor = 5000;
		p2.ano = 2005;
		
		System.out.println(p2.marca);
		System.out.println(p2.valor);
		System.out.println(p2.ano);
		System.out.println();
		p2.dirigir();
		p2.estacionar();
		System.out.println();

	}

}
