package com.empresa;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		// Estructura While

//		while(condicion) {
//			
//		}

//		se ejecute una vez
//		se ejecute mas de una vez
//		no se ejecute nunca

		// Estructura Do While
//		se ejecute una vez SIEMPRE!
//		se ejecute mas de una vez
		System.out.println("Inicio app ");
		Scanner teclado = new Scanner(System.in);
		int numeroingresado = 0;

		do {

			System.out.println("por favor ingrese un numero mayor a 0!");
			numeroingresado = teclado.nextInt();

		} while (numeroingresado < 0);

		System.out.println("Felicitaciones ingreso un numero positivo!");

		// mostrar lo numeros pares del 0 al 100 con estructura while y do while
		int contador = 0;
		System.out.println("lo hacemos con while ");

		while (contador <= 100) {
			System.out.println(contador);
			contador+=2; //esto es igual a poner contador = contador + 2;
		}

		
		System.out.println("lo hacemos con do while ");
			//reseteo el contador
		contador = 0 ;
		do {
			System.out.println(contador);
			contador+=2;
		} while (contador <= 100);

	}

}
