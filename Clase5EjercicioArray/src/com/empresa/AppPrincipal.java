package com.empresa;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
//		1) crear un array de 10 posiciones de numeros con 
//valores pedidios por teclado , Muestra por consola el indice y el valor que corresponde 

		final int TAMANIO = 10;
		int num[] = new int[TAMANIO];
		Scanner teclado = new Scanner(System.in);

		// como conocer la cantidad de elementos que tiene un array ??
		System.out.println("cantidad de elementos que tiene el array" + num.length);

		// recorro y cargo array con for
		for (int indice = 0; indice < num.length; indice++) {
			System.out.println("ingrese el numero " + indice);
			num[indice] = teclado.nextInt();
		}

		// muestro el array con un for
		for (int indice = 0; indice < num.length; indice++) {
			System.out.println("en el indice [" + indice + "] esta el valor " + num[indice]);
		}

		teclado.close();
	}

}
