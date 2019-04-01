package modelo;

public class Numero {
	
	private int n;

	public Numero(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int sumar(int n1) {
		
		return n1 + n;
		
	}
	
	public int multiplicar(int n1) {
		return n1*n;
	}
	
	public boolean esPar(){
		boolean aux = false;
		if(n%2==0) {
			aux=true;
		}
		return aux;
	}
	
	
	public boolean esPrimo(){
		boolean aux = true;
		for(int i = 2; i<n && aux == true;i++) {

			if(n%i == 0) {
				aux = false;		
			}
		}
		return aux;
	}
	
	public String  convertirAString() {
		
	return String.valueOf(n);	
	}
	/*
	public double convertirDouble() {
		return Double.parseDouble(n); 
	}*/
	
	public double calcularPotencia(int exp) {
		return Math.pow(n, exp);
	}
	
	/*
	public String pasarBase2() {
		
	}
	*/
	
	public int calcularFactorial() {
		int aux = 1;
		int factorial = 1;
		while(aux<=n) {
			factorial = factorial * (aux);
			aux++;
		}
		return factorial;
	}
	/*
	
	public void numeroCombinatorio(int n1) {
		
	}
	
	*/
	
}
