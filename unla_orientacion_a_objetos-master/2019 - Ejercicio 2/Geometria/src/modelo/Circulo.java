package modelo;

public class Circulo {
	
	private Punto origen;
	private double radio;
	
	
	
	public Circulo(Punto origen, double radio) {
		super();
		this.origen = origen;
		this.radio = radio;
	}
	
	
	public Punto getOrigen() {
		return origen;
	}
	public void setOrigen(Punto origen) {
		this.origen = origen;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(Punto p) {
		this.radio = origen.calcularDistancia(p);
	}

	public boolean equals (Circulo c) {
		boolean aux = false;
		if(c.getOrigen().equals(origen)&&(radio == c.getRadio())){
			aux = true;
		}		
		return aux;
	}


	@Override
	public String toString() {
		return "To String definido nuevamente (metodo sobrecargado): [origen=" + origen + ", radio=" + radio + "]";
	}
	
	public double calcularPerimetro() {
		return 2*Math.PI*radio;
	}
	
	public double calcularArea() {
		double aux = (calcularPerimetro()*radio)/2;
		return aux;
	}
	
	public double calcularDistancia(Circulo c) {
		return c.origen.calcularDistancia(origen);
	}
	

	
}
