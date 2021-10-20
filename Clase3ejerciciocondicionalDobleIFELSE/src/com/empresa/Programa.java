package com.empresa;

import java.util.Scanner;

//1) Determinar si un alumno aprueba un curso de programación, sabiendo que aprobara si su promedio de tres

//calificaciones es mayor o igual a 7; reprueba en caso contrario

public class Programa {

	public static void main(String[] args) {

		float nota1 = 0, nota2 = 0, nota3 = 3, promedio = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese la nota 1");
		nota1 = teclado.nextFloat();

		System.out.println("Ingrese la nota 2");
		nota2 = teclado.nextFloat();

		System.out.println("Ingrese la nota 3");
		nota3 = teclado.nextFloat();

		promedio = (nota1 + nota2 + nota3) / 3;

		// condicional Doble
		if (promedio >= 7) {
			// acciones a ejecutar si la condicion se cumple
			System.out.println("estas aprobado tu promedio es " + promedio);
		} else {
			// acciones a ejecutar si la condicion NOOOO se cumple
			System.out.println("estas desaprobado tu promedio es " + promedio);
		}

		System.out.println("fin de la app");
	}

}
