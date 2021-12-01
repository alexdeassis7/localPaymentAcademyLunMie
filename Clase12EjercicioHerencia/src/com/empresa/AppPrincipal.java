package com.empresa;


public class AppPrincipal {

	public static void main(String[] args) {

		VueloCarga vc = new VueloCarga();
		
		vc.agregarPaquete(1, 3, 3);
		vc.agregarPaquete(2, 3, 3);
		vc.agregarPaquete(143, 5, 3);
		
		
		Passenger marcelo = new Passenger();
		Passenger gerardo = new Passenger();
		
		//intento subir 15 pasajeros 
		for (int i = 0; i < 15; i++) {
			vc.agregarPasajero(gerardo);
		}
		

		
		
		 //aca solo tendrias accesos a las capacidades que sosn visibles para la clase de Vuelo 
		Vuelo f  = new VueloCarga();
		f.agregarPasajero(marcelo);
		//esto no se puede 
		//f.agregarPaquete(1, 3, 3);
		
		Vuelo[] flota = new Vuelo[4];
		flota[0] = new Vuelo();
		flota[1] = new VueloCarga();
		flota[2] = new Vuelo();
		flota[3] = new VueloCarga();
		
		
		Vuelo f2 = new Vuelo();
		System.out.println(f2.getAsientos());
		
		VueloCarga f3 = new VueloCarga();
		System.out.println(f3.getAsientos());
		
		//no se puede 
		//VueloCarga f4 = new Vuelo();
		
		Object[] o1 = new Object[3];
		
		o1[0] = new Vuelo();

		o1[1] = new Passenger();

		o1[2] = new VueloCarga();
		
		
	}

}
