package com.empresa;

import java.util.Scanner; //agregamos la libreria para poder usar el scanner 

//ejercicio
//suponga  que un individuo desea invertir su capital en un banco y desea saber cuanto 
//dinero ganara despues de un mes si el banco paga a razon de 2% mensual 
public class AppPrincipal {

	public static void main(String[] args) {
		// que variables necesito
		float capital = 0, ganancia = 0;

		// para ingresar datos me creo un Scanner
		Scanner teclado = new Scanner(System.in);

		// que entra a mi app
		System.out.println("ingrese el capital que desea invertir este mes en el banco ");
		// capturo el dato ingreszado por teclado
		capital = teclado.nextFloat();

		System.out.println("usted invertira " + capital + " pesos por 30 dias ");

		// que se procesa , calculo la ganancia
		ganancia = capital * 0.02f;

		// que sale
		System.out.println("su ganancia en 30 dias sera de " + ganancia + " pesos");

	}

}
