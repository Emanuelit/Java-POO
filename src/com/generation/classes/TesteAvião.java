package com.generation.classes;

public class TesteAvião {

	public static void main(String[] args) {
		Avião av1 = new Avião();
		Avião av2 = new Avião();

		av1.modelo = "Airbus A380";
		av1.marca = "EADS Airbus";
		av1.ano = 1998;

		System.out.println(av1.modelo);
		System.out.println(av1.marca);
		System.out.println(av1.ano);
		System.out.println();
		av1.pousar();
		av1.decolar();
		System.out.println();

		av2.modelo = "Boeing 777-8. ";
		av2.marca = "Boeing";
		av2.ano = 2010;

		System.out.println(av2.modelo);
		System.out.println(av2.marca);
		System.out.println(av2.ano);
		System.out.println();
		av2.pousar();
		av2.decolar();
		System.out.println();

	}

}
