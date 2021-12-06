package com.empresa;

public class Persona {

	public String nombre;
	public String apellido;
	public int edad;
	public long numeroDocumento;
	public Persona() {
	}

	public Persona(String nombre, String apellido, int edad, long numeroDocumento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.numeroDocumento = numeroDocumento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", numeroDocumento="
				+ numeroDocumento + "]";
	}
	
	
	
}
