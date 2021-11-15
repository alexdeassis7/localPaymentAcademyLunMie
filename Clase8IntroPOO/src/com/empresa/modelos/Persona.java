package com.empresa.modelos;

/**
 * ejercicio > definir una clase persona que posea los atributos : nombre ,
 * apellido , edad , anioNacimiento
 * 
 * luego en el "main" instanciar 2 objetos con el siguiente estado en sus
 * atributos ------p1 Alex Cabrera 25 1993 ------p2 Rocio Vacca 28 1992
 * 
 * mostrar por consola el estado final de los objetos p1 y p2
 */

//TAREA UTILIZAR LOS CONSTRUCTORES NUEVOS Y CREAR DOS COSTRUCTORES MAS CON DOS PARAMETROS CADA UNO
public class Persona {

	String nombre;
	String apellido;
	int edad;
	int anioNacimiento;

	public Persona() {

	}

	public Persona(String nombre, String apellido, int edad, int anioNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.anioNacimiento = anioNacimiento;
	}

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public void caminar(String lugar) {
		System.out.println("soy " + nombre + " y estoy caminando por " + lugar);
	}
	
	public void verProgramaTv(String programa) {
		System.out.println("soy " + nombre + " y estoy mirando el programa " + programa +" en la TV.") ;
	}
	
	
	// creamos el metodo to String para mostrar el estado de los atributo de mi
	// clase
	// shortcut = alt + shift + s
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", anioNacimiento="
				+ anioNacimiento + "]";
	}

}
