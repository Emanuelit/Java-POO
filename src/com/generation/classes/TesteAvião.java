package com.generation.classes;

public class TesteAvi�o {

	public static void main(String[] args) {
		Avi�o av1 = new Avi�o();
		Avi�o av2 = new Avi�o();

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
