package com.generation.classes;

public class TesteFuncion�rio {

	public static void main(String[] args) {
		Funcion�rio f1 = new Funcion�rio();
		Funcion�rio f2 = new Funcion�rio();
		
		f1.Cargo = "Product Owner";
		f1.Empresa = "Amazon";
		f1.sal�rio = 15000;
		
		System.out.println(f1.Cargo);
		System.out.println(f1.Empresa);
		System.out.println(f1.sal�rio);
		System.out.println();
		f1.trabalhar();
		f1.entrarDeF�rias();
		System.out.println();
		
		f2.Cargo = "Product Manager";
		f2.Empresa = "Google";
		f2.sal�rio = 10000;
		
		System.out.println(f2.Cargo);
		System.out.println(f2.Empresa);
		System.out.println(f2.sal�rio);
		System.out.println();
		f2.trabalhar();
		f2.entrarDeF�rias();
		System.out.println();
		

	}

}
