package com.empresa.modelos;
/**ejercicio > definir una clase persona 
que posea los atributos : nombre , apellido , edad , anioNacimiento

luego en el "main" instanciar 2 objetos con el siguiente estado en sus atributos 
------p1
Alex
Cabrera
25
1993
------p2
Rocio
Vacca
28
1992

mostrar por consola el estado final de los objetos p1 y p2 */
public class Persona {

	String nombre;
	String apellido;
	int edad;
	int anioNacimiento;


	// creamos el metodo to String para mostrar el estado de los atributo de mi clase
	// shortcut = alt + shift + s
	
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", anioNacimiento="
				+ anioNacimiento + "]";
	}


}
