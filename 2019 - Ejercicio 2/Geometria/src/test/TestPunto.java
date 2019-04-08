package test;
import modelo.Punto;

public class TestPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Punto pto1= new Punto(2,5);
		Punto pto2= new Punto(3,5);
		Punto pto3= new Punto(2,5);
		
		System.out.println(pto1.toString());
		System.out.println(pto2.equals(pto3));
		System.out.println(pto1.equals(pto3));
	}

}
