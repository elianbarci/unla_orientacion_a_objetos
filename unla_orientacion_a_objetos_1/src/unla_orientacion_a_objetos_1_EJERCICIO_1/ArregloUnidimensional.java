package unla_orientacion_a_objetos_1_EJERCICIO_1;

import java.util.*;

public class ArregloUnidimensional {
	
	private int[] vector;
	int[] aux;
	int size;
	String auxS;

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}
	
	public ArregloUnidimensional(int[] vector){
		this.vector = vector;
	}
	
	public String ordenarArray(){
		Arrays.sort(vector);
		auxS = Arrays.toString(vector);
		return auxS;
	}
	
	public int sizeArray(){
		size = vector.length;
		return size;
	}
	
	public String ordenarArrayMayor(){
		
		List<Integer> lista = new ArrayList<Integer>();
		
		for (int x : vector)
			lista.add(x);
		
		Collections.reverse(lista);
		
		return lista.toString();
	}
	
	
	public int traerElMenor(){
		int menor=99;
		int i=0;
		for(i=0;i<=4;i++){
			if(vector[i]<menor){
			menor=vector[i];
			}
		}			
		return menor;
	}
	
	
	public int traerElMayor(){
		int mayor=0;
		int i=0;
		for(i=0;i<=vector.length - 1;i++){
			if(vector[i]>mayor){
			mayor=vector[i];
			}
		}			
		return mayor;
	}
	
	
	public double traerPromedio(){
		double suma=0;
		int i=0;
		double promedio;
		for(i=0;i<=vector.length - 1;i++){
			suma=suma+vector[i];
		}
		promedio=suma/4;
		return promedio; 
	}
	
	
}


