package modelo;

import java.util.Arrays;
import java.util.Vector;

public class ArregloUnidimensional {
	
	private int [] vector;

	public ArregloUnidimensional(int[] vector) {
		super();
		this.vector = vector;
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	} 
	
	public int traerElMenor() {
		int aux = vector[0];
		
		for (int i = 0; i < vector.length; i++){
		    
			if(vector[i]<aux) {
		    	aux=vector[i];
		    }
		}
		return aux;
	}
	
	public int traerElMayor() {
		int aux = vector[0];
		
		for (int i = 0; i < vector.length; i++){
		    
			if(vector[i]>aux) {
		    	aux=vector[i];
		    }
		}
		return aux;
	}
	
	public double calcularPromedio() {
		
		int aux = vector[0];
		
		for (int i = 0; i < vector.length; i++){
		    
			aux = aux + vector[i];
			
		}
		return aux/vector.length;
		
	}
	
	public  int [] calcularAscendente() {
		
		int aux = 0;		
		for(int i = 0; i<vector.length-1; i++){			//Nos posicionamos en el primer elemento
			for(int j = 0;j<vector.length-1;j++){		//Comenzamos a recorrer el vector con ese primer elemento
				if (vector[j]>vector[j+1]){				//Si el elemento recorrido es mayor que ese primer elemento
					aux = vector[j];					//Lo guardamos en un auxiliar
					vector[j]=vector[j+1];				//Pasamos el que es menor a su lugar
					vector[j+1] = aux;					//Y mandamos ese que es mayor a el segundo lugar
				}
			}
		}
		

		
	return vector;
				
	}
	
public  int [] calcularDescendente() {
		
		int aux = 0;		
		for(int i = 0; i<vector.length-1; i++){			//Nos posicionamos en el primer elemento
			for(int j = 0;j<vector.length-1;j++){		//Comenzamos a recorrer el vector con ese primer elemento
				if (vector[j]<vector[j+1]){				//Si el elemento recorrido es mayor que ese primer elemento
					aux = vector[j];					//Lo guardamos en un auxiliar
					vector[j]=vector[j+1];				//Pasamos el que es menor a su lugar
					vector[j+1] = aux;					//Y mandamos ese que es mayor a el segundo lugar
				}
			}
		}
		
		return vector;
		
	}

public String toString(int [] vector) {
	
	Vector g = new Vector();
	
	for (int h = 0; h < vector.length; h++) {
		
	    g.add(vector[h]);
	    
	}
	
	System.out.println("Array desordenado: ");	
	System.out.println(g.toString());
	return "ArregloUnidimensional [vector=" + Arrays.toString(vector) + "]";
}





	
}
