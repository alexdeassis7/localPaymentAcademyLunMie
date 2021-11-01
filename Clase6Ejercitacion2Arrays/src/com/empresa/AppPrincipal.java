package com.empresa;
//Almacenar 500 números en un vector, elevar al cuadrado cada valor 

//almacenado en el vector, almacenar el resultado en otro vector. 
//Imprimir el vector original y el vector resultante

public class AppPrincipal {

	public static void main(String[] args) {

		// Definimos los arrays
		final int TAMANIO = 500;
		int arrayOriginal[] = new int[TAMANIO];
		int arrayResultante[] = new int[TAMANIO];

		// recorremos , cargamos y mostramos los arrays con un for
		for (int i = 0; i < TAMANIO; i++) {
			// cargo el array original con valores aleatorios
			arrayOriginal[i] = (int) (Math.random() * 50 + 1);
			// elevo al cuadrado el valor del array original y guardo en vector resultante
			arrayResultante[i] = arrayOriginal[i] * arrayOriginal[i];
			System.out.println("arrayOriginal[" + i + "] = " + arrayOriginal[i]);
			System.out.println("arrayResultante[" + i + "] = " + arrayResultante[i]);
		}

	}

}
