package com.empresa;

//clase padre o clase base 
public class Vuelo {

	public int numVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosDisponibles;

	// inicializador de bloque : bloque de codigo que se ejecutara antes de
	// cualquier constructor
	{
		asientosDisponibles = new boolean[150];
		for (int i = 0; i < getAsiento(); i++) {
			asientosDisponibles[i] = true;
			System.out.println("disponibilizando butaca " + (i +1));
		}
		System.out.println("Disponibilizando las butacas. ");
	}

//	sobrecarga de metodos constructores 
	public Vuelo() {
	}

	public Vuelo(char claseVuelo) {
		this.claseVuelo = claseVuelo;
	}

	public Vuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}

	public void agregarPasajero(Passenger p1) {
		if (asientoDisponible()) {
			//aca de tareamostrar nombre del pasajero que sube al avion 
			System.out.println("se subio al pasajero al avion");
			pasajeros += 1;
		}else {
			faltaAsiento();
		}
	}

	private boolean asientoDisponible() {
		return pasajeros < getAsiento();
	}

	private void faltaAsiento() {
		System.out.println("no quedan mas asientos busque otra aerolinea");
	}

	public int getAsientos() {
		return getAsiento();
	}

	public int getAsiento() {
		return 150;
	}

}
