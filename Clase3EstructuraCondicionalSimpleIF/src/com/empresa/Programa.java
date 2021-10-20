package com.empresa;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		/*
		 * int edadGera = 28; int edadMarce = 25;
		 * 
		 * System.out.println("inicio de la app"); if (edadGera > edadMarce) { //
		 * sentencias a ejecutar si la condicion es true
		 * System.out.println("gerardo es el mas viejo de los dos "); }
		 * 
		 * System.out.println("fin de la app");
		 */

		// 1) Implementar un algoritmo que calcule y muestre por pantalla el valor

		// final de la compra de un artículo. El algoritmo debe permitir el ingreso del
		// precio del artículo y la cantidad de artículos. Si el subtotal es superior a
		// 1000, entonces se debe aplicar un descuento del 10 %.

		// defino mis variables de trabajo

		float cantidad = 0, precio = 0, descuento = 0, subtotal = 0, totalCompra = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Cálculo de la compra de un artículo");
		// solicitamos los datos al usuario
		System.out.println("Ingrese el precio del artículo");
		precio = teclado.nextFloat();

		System.out.println("Ingrese la cantidad de artículos a comprar");
		cantidad = teclado.nextFloat();

		// procesamos la informacion
		subtotal = precio * cantidad;

		if (subtotal > 1000) {// condicional simple
			descuento = subtotal * 0.10f;// como gasto mas de mil pesos le calculamos el descuento
		}

		totalCompra = subtotal - descuento;

		if (descuento > 0) {// condicional simple
			System.out.println("Se aplicó un descuento de " + descuento);
		}

		System.out.println("El valor final de la compra es: " + totalCompra);

	}

}
