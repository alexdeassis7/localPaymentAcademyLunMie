package com.empresa;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {

		System.out.println("Inicio de la app!");

		// Leer 10 números e imprimir solamente los positivos
		Scanner teclado = new Scanner(System.in);
		int numeroingresado = 0, contador = 1;

		while (contador <= 10) {
			// sentencias a ejecutar mientras la condicion se cumpla
			System.out.println("Ingrese el numero " + contador);
			numeroingresado = teclado.nextInt();

			if (numeroingresado > 0) {
				System.out.println("el numero " + numeroingresado + " es POSITIVO!");
			}
			
			//INCREMENTAMOS EL CONTADOR PARA NO ENTRAR EN UN LOOP 
			contador++;
		}

		System.out.println("fin de la app!");

	}

}
