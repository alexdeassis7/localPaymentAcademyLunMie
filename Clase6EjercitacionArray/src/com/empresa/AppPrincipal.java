package com.empresa;

public class AppPrincipal {

	public static void main(String[] args) {

		// Definimos los arrays
		final int TAMANIO = 45;
		int arrayA[] = new int[TAMANIO];
		int arrayB[] = new int[TAMANIO];
		int arrayC[] = new int[TAMANIO];

//		Math.random() = genera un numero aleatorio entre 0.0 y 1.0 , excluido el ultimo valor
//		es decir puede devolver por eje : 0.34645 , 0.23565 , 0985656,	

		System.out.println("math.ramdom() = " + (int) (Math.random())); // esto genera valores entre 0.0 y 1.0 excluido
																		// el
																		// 1.0
		System.out.println("math.ramdom() = " + (int) (Math.random() * 6)); // esto genera valores de 0.0 a 6.0,excluido
																			// el 6.0
		System.out.println("math.ramdom() = " + (int) (Math.random() * 6 + 1)); // Esto genera Valores entre 1.0 y 7.0 ,
																				// excluido el 7.0

		// recorremos y cargamos el BrrayA y arrayB
		for (int i = 0; i < TAMANIO; i++) {
			arrayA[i] = (int) (Math.random() * 6 + 1); // inserto valores aleatorios en el arrayA en la posicion "i"
			arrayB[i] = (int) (Math.random() * 50 + 1); // inserto valores aleatorios en el arrayB en la posicion "i"
			arrayC[i] = arrayA[i] + arrayB[i];
		}

		// recorremos y mostramos los arrays por consola
		for (int i = 0; i < TAMANIO; i++) {
			System.out.print("ArrayA[" + i + "] = " + arrayA[i]);
			System.out.print(" + ArrayB[" + i + "] = " + arrayB[i] + " = ArrayC[" + i + "] = " + arrayC[i] + " ------ >>> ");
			System.out.println(arrayA[i] + " + " + arrayB[i] + " =" + arrayC[i]);
		}

	}

}
