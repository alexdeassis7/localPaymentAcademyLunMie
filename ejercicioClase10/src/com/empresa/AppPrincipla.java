package com.empresa;

import java.util.Scanner;



public class AppPrincipla {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese el nombre "); 
		String nombre = teclado.next();
		
		System.out.println("Ingrese el apellido "); 
		String apellido = teclado.next();
		
		
		System.out.println("Ingrese el num de documento "); 
		long numDoc = teclado.nextLong();
		
		System.out.println("Ingrese el tipo de documento "); 
		String tipoDoc = teclado.next();
		
		Persona p1 = new Persona(nombre, apellido);
		Documento doc1 = new Documento(tipoDoc, numDoc);
		
		p1.setDocumento(doc1);
		
		Persona p2 = new Persona("moni", "Argento");

		Persona p3 = new Persona("paola", "Argento");

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		
		teclado.close();
	}
}
