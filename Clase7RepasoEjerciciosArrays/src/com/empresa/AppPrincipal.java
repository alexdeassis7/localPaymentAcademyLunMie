package com.empresa;
//Almacenar 300 números en un vector, imprimir cuantos son ceros, 

//cuantos son negativos y cuantos positivos. Imprimir además la 
//suma de los negativos y la suma de los positivos 

public class AppPrincipal {

	public static void main(String[] args) {
		// Definimos los arrays
		final int TAMANIO = 300;
		int vector[] = new int[TAMANIO];
		int mitadDelVector = TAMANIO / 2;
		int contadorNegativos = 0, contadorPositivos = 0, sumatoriaPositivos = 0, sumatoriaNegativos = 0,
				contadorNeutros = 0;

		// recorremos y cargamos el vector con numeros positivos y neutros
		for (int i = 0; i < mitadDelVector; i++) {
			vector[i] = (int) (Math.random() * 6); // inserto valores aleatorios en el arrayA en la posicion "i"
			// mostramos los valores insertados en el vector
			System.out.println("vector[" + i + "] =" + vector[i]);
		}
		// recorremos y cargamos el vector con numeros negativos
		for (int i = mitadDelVector; i < TAMANIO; i++) {
			vector[i] = (int) (Math.random() * -6);
			// mostramos los valores insertados en el vector
			System.out.println("vector[" + i + "] =" + vector[i]);
		}

		// recorro el vector para detectar positivos , negativos y neutros
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < 0) {
				contadorNegativos++; // incremento el contador de numeros negativos
				sumatoriaNegativos += vector[i]; // vamos sumando todos los negativos
			} else if (vector[i] > 0) {
				contadorPositivos++;// incremento el contador de numeros positivos
				sumatoriaPositivos += vector[i]; // vamos sumando todos los negativos
			} else {
				contadorNeutros++; // incremento el contador de numeros neutros
			}
		}

		// mustro los resultados por pantalla
		System.out.println("Cantidad de numeros positivos dentro del vector : " + contadorPositivos);
		System.out.println("Cantidad de numeros negativos dentro del vector : " + contadorNegativos);
		System.out.println("Cantidad de numeros neutros dentro del vector : " + contadorNeutros);
		System.out.println("suma de todos los positivos : " + sumatoriaPositivos);
		System.out.println("suma de todos los negativos : " + sumatoriaNegativos);

	}

}
