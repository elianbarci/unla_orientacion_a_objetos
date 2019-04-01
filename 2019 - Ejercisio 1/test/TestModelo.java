package test;

import modelo.Numero;

public class TestModelo {

	public static void main(String[] args) {
		
		Numero numero = new Numero(40);
		System.out.println(numero.sumar(10));
		System.out.println(numero.multiplicar(5));
		System.out.println(numero.esPar());
		System.out.println("PRIMO: " + numero.esPrimo());

	}

}
