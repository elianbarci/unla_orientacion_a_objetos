package test;

import modelo.ArregloUnidimensional;

public class TestUni {

	public static void main(String[] args) {
		
		int [] vector = {10,8,11,87,99,5};
		
		ArregloUnidimensional a = new ArregloUnidimensional(vector);
		
	System.out.println(a.calcularAscendente().toString());

	}

}
