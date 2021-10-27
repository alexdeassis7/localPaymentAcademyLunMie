package com.empresa;

public class AppPrincipal {

	public static void main(String[] args) {
		// como declarar un array

		int miArrrayDeEnteros[];
		int[] miArrrayDeEnteros2;

		// tipos de datos de arrays
		byte miArrrayByte[];
		short miArrrayShort[];
		boolean miArrrayBoolean[];
		long miArrrayLong[];
		float miArrrayFloat[];
		double miArrrayDouble[];
		char miArrrayChar[];

		int intArray[]; // declaro un array
		intArray = new int[50]; // inicializo un array con 50 elementos

		int[] miArray = new int[50]; // defino e inicializo el array en un solo paso

		int numero; // definir o declarar
		numero = 10; // inicializar!
		int numeroDos = 10; // definir e inicializar

		// definimos un array de manera literal
		int[] edades = new int[] { 26, 15, 22, 23, 14, 45, 50, 56 };
		
		//accedemos a los elementos del array  mediante su indice
		System.out.println("el elemento en indice [1] del array es : " + edades[1]);//15
		System.out.println("el elemento en indice [3] del array es : " + edades[3]);//23
		System.out.println("el elemento en indice [4] del array es : " + edades[4]);//14
		System.out.println("el elemento en indice [6] del array es : " + edades[6]);//50
		
         //modificamos un elemento del array 
		edades[3] = 78;
		System.out.println("el elemento en indice [3] del array es : " + edades[3]);//78
	}

}
