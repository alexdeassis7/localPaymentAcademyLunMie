package com.empresa;

import java.util.Scanner;

//Una tienda ofrece un descuento del 15% sobre el total de la compra y
//un cliente desea saber cuanto  debera pagar finalmente por su compra 
public class Programa {

	public static void main(String[] args) {
		// que varibles defino y de que tipo de dato
		float totalCompra = 0, total_a_pagar = 0, descuento = 0;
		// defino un valor constante que no va a mutar a lo largo de la ejecucion de mi
		// app
		final float INTERES = 0.15f;
		Scanner teclado = new Scanner(System.in);

		// INTERES = 0.30f; ERROR DE COMPILACION , no podes modificar un valor constante

//		que entra a mi programa ?
		System.out.println("ingrese el total de su compra");
		totalCompra = teclado.nextFloat();

//		que se procesa mi programa ?
		descuento = totalCompra * INTERES; 
		total_a_pagar = totalCompra - descuento;

//		que sale de mi programa ?
		System.out.println("el total a pagar por su compra es de " + total_a_pagar + ", vuelvas pronto !");
		
	}

}
