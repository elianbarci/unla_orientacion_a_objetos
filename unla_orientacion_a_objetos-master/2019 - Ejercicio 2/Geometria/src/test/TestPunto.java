package test;
import modelo.Circulo;
import modelo.Punto;

public class TestPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Punto pto1= new Punto(2,5);
		Punto pto2= new Punto(3,5);
		Punto pto3= new Punto(7,8);
		
		Circulo c = new Circulo(pto1, 5);			//AGREGACION, la insstancia de Punto pto1
													//es independiente a la existencia del circulo. 
		Circulo g = new Circulo(new Punto(5,8), 5);	//COMPOSICION
													//La instancia de Punto creado depende
													//de la existencia de este mismo circulo
		
		System.out.println("AREA: "+ c.calcularArea());
		System.out.println("DISTANCIA: "+ c.calcularDistancia(g));
		
		System.out.println("ToString sobrecargado en clase Punto: " + pto1.toString());
		System.out.println(pto2.equals(pto3));
		System.out.println(pto1.equals(pto3));
		System.out.println(pto1.calcularDistancia(pto3));
	}

}
