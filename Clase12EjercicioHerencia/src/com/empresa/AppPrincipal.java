package com.empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese el nombre del pasajero");
		String nombre = teclado.next();
		
		System.out.println("Ingrese el apellido del pasajero");
		String apellido = teclado.next();
		
		System.out.println("Ingrese la edad del pasajero");
		int edad = teclado.nextInt();
		
		System.out.println("Ingrese el dni del pasajero");
		long dni = teclado.nextLong();
		
		teclado.close();
		
		Passenger gera = new Passenger(nombre, apellido, edad, dni);
		Passenger marce = new Passenger("marcelo", "cabrera", 27, 36898985);
		Passenger emilse = new Passenger("Sofia", "Garcia", 21, 36889887);

		Passenger daniela = new Passenger(2);
		daniela.nombre = "daniela";

		Passenger sebas = new Passenger(1);
		sebas.nombre = "sebastian";

		Passenger alex = new Passenger(3, 1);
		alex.nombre = "alex";

		// arrayList de pasajeros
		ArrayList<Passenger> pasajeros = new ArrayList<Passenger>();

		// agrego lo spasajeros al arrayList
		pasajeros.add(emilse);
		pasajeros.add(gera);
		pasajeros.add(marce);

		// Array comun de pasajeros
		Passenger[] pasajeros2 = new Passenger[6];
		pasajeros2[0] = emilse;
		pasajeros2[1] = gera;
		pasajeros2[2] = marce;
		pasajeros2[3] = daniela;
		pasajeros2[4] = sebas;
		pasajeros2[5] = alex;

		Passenger.mostrarListaPasajeros(pasajeros2);

		// creamos vuelo de carga
		VueloCarga vc = new VueloCarga();
		vc.agregarPaquete(1, 3, 3);
		vc.agregarPaquete(2, 3, 3);
		vc.agregarPaquete(143, 5, 3);

		Passenger marcelo = new Passenger();
		Passenger gerardo = new Passenger();

		// intento subir 15 pasajeros
		for (int i = 0; i < 15; i++) {
			vc.agregarPasajero(gerardo);
		}

		// aca solo tendrias accesos a las capacidades que sosn visibles para la clase
		// de Vuelo
		Vuelo f = new VueloCarga();
		f.agregarPasajero(marcelo);
		// esto no se puede
		// f.agregarPaquete(1, 3, 3);

		Vuelo[] flota = new Vuelo[4];
		flota[0] = new Vuelo();
		flota[1] = new VueloCarga();
		flota[2] = new Vuelo();
		flota[3] = new VueloCarga();

		Vuelo f2 = new Vuelo();
		System.out.println(f2.getAsientos());

		VueloCarga f3 = new VueloCarga();
		System.out.println(f3.getAsientos());

		// no se puede
		// VueloCarga f4 = new Vuelo();

		Object[] o1 = new Object[3];

		o1[0] = new Vuelo();

		o1[1] = new Passenger();

		o1[2] = new VueloCarga();

	}

}
