package modelo;

public class Punto {

	private double x,y;

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";		//Hay que redifinir equals y toString
	}
	
	public double calcularDistancia (Punto p) {
		double aux = 0;
		
		return aux;
	}
	
	/*	
	 *Diferencia entre Polimorfismo y Sobrecarga
	 *	Sobrecarga:
	 * 		Se envian diferentes parametros o tipos de parametros pero el cuerpo es el mismo
	 *	
	 *	Polimorfismo:
	 *		Se cambia el cuerpo del metodo.
	 *En ambos casos la firma, es decir, el nombre del metodo es el mismo.
	 *
	 *LOS OBJETOS SE COMPARAN CON EQUALS
	 *
	 *Hay variables primitivas y variables de clase
	 *
	 *	Las clases pueden tener atributos aunque tambièn pueden tener atributos de variables de clase.
	 *
	 *Entre clases puede haber diferentes relaciones que son representadas en UML:
	 *		
	 *		Composición:
	 *				
	 *				Si limpio memoria en el objeto que contiene a la otra clase, se libera
	 *				tambien el objeto contenido.
	 *				
	 *
	 *		Agregación:
	 * 				
	 *				Porque cada clase es independiente, no desaparece si se elimina una.
	 *
	 *
	 *
	 */				
	
	
}
