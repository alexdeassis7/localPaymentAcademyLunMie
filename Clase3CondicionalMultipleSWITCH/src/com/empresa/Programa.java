package com.empresa;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
//      ejemplo sintaxis
//		int numero = 36;
//
//		System.out.println("inicio del condicional Multiple");
//		switch (numero) {
//
//		case 1:
//			System.out.println("el numero es uno");
//			break;
//		case 2:
//			System.out.println("el numero es dos");
//			break;
//		case 3:
//			System.out.println("el numero es tres");
//			break;
//
//		default:
//			System.out.println("el numero " + numero + " es invalido !");
//		}
//		System.out.println("fin del condicional Multiple");
//		 

		// 1) Desarrollar un algoritmo que permita ingresar un número entero
		// comprendido entre 1 y 7, y que muestre por pantalla el día de la semana al
		// que se corresponde.

		int numeroEntero = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero por favor");
		numeroEntero = teclado.nextInt();

		switch (numeroEntero) {// condicional multiple
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miercoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("el numero " + numeroEntero + " no se corresponde a un dia de la semana ");
		}
		System.out.println("Fin de la app ");
	}

}
