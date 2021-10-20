package com.empresa;

import java.util.Scanner;
//Un maestro desea saber que porcentaje de hombre y que porcentaje de mujeres tiene

//en un grupo de estudiantes 

public class Programa {

	public static void main(String[] args) {
		// que varibles defino y de que tipo de dato
		float numHombres = 0, numMujeres = 0, totalAlumnos = 0, porcentajeHombres = 0, porcentajeMujeres = 0;
		final float PORCENTAJE = 100;
		Scanner teclado = new Scanner(System.in);

//		que entra a mi programa ?
		System.out.println("Ingrese el numero de Hombres");
		numHombres = teclado.nextFloat();

		System.out.println("Ingrese el numero de Mujeres");
		numMujeres = teclado.nextFloat();

		// que se procesa mi programa ?
		totalAlumnos = numHombres + numMujeres;
		porcentajeMujeres = numMujeres * PORCENTAJE / totalAlumnos;
		porcentajeHombres = numHombres * PORCENTAJE / totalAlumnos;

//		que sale de mi programa ?
		System.out.println("El porcentaje de hombres es : " + porcentajeHombres);
		System.out.println("El porcentaje de mujeres es : " + porcentajeMujeres);

	}

}
