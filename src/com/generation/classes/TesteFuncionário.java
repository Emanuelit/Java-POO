package com.generation.classes;

public class TesteFuncionário {

	public static void main(String[] args) {
		Funcionário f1 = new Funcionário();
		Funcionário f2 = new Funcionário();
		
		f1.Cargo = "Product Owner";
		f1.Empresa = "Amazon";
		f1.salário = 15000;
		
		System.out.println(f1.Cargo);
		System.out.println(f1.Empresa);
		System.out.println(f1.salário);
		System.out.println();
		f1.trabalhar();
		f1.entrarDeFérias();
		System.out.println();
		
		f2.Cargo = "Product Manager";
		f2.Empresa = "Google";
		f2.salário = 10000;
		
		System.out.println(f2.Cargo);
		System.out.println(f2.Empresa);
		System.out.println(f2.salário);
		System.out.println();
		f2.trabalhar();
		f2.entrarDeFérias();
		System.out.println();
		

	}

}
