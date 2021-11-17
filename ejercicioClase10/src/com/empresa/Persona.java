package com.empresa;

public class Persona {

	public String nombre;
	public String apellido;
	private int edad;
	private Documento documento;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		// seteo edad de forma aleatoria
		// Números generados entre 1 y 120, sin decimales (sin incluir el 1 y el 120)"
		this.edad = (int) Math.floor(Math.random() * (1 - 120) + 120);
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento
				+ "]";
	}


}
