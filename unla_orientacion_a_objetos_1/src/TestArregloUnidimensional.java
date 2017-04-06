
public class TestArregloUnidimensional {

	public static void main(String[] args) {
		int[] array = {3, 8, 9, 7, 5, 8, 1};
		ArregloUnidimensional a = new ArregloUnidimensional(array);
		System.out.println(a.ordenarArray());
		System.out.println(a.ordenarArrayMayor());
		System.out.println("EL numero menor es "+a.traerElMenor());
		System.out.println("EL numero mayor es "+a.traerElMayor());
		System.out.println(a.sizeArray() + " el array en realidad es de 4 ¿Por que .length devuelve siempre uno más?");
		System.out.println("El promedio de todo el array es de: " + a.traerPromedio());
	}

}
