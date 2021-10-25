package com.empresa;

import java.util.Iterator;
import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		// Demo estructura repetitiva for

		// mostrar lo numeros pares del 0 al 100 con estructura for
		System.out.println("Inicio de la app");

		for (int i = 0; i <= 100; i = i + 2) {
			System.out.println(i);
		}

		System.out.println("Fin de la app");

		// ejercicitacion FOR
		// Leer 10 números y obtener su cubo y su cuarta
		int numeroIngresado = 0;
		Scanner teclado = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Ingrese el numero " + i);
			numeroIngresado = teclado.nextInt();
//			 2  cubo de 2 es 2*2*2
//			    cuarta de 2 = 2*2*2*2
			int cubo = numeroIngresado * numeroIngresado * numeroIngresado;

			int cuarta = cubo * numeroIngresado;

			System.out.println("cubo de " + numeroIngresado + " =  " + cubo);
			System.out.println("cuarta de " + numeroIngresado + " =  " + cuarta);

		}

		System.out.println("Fin de la app");
	}

}
