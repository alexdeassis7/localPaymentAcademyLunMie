package com.empresa;

//implementamos la interfaz

public class DirectorEmpleado implements Empleados {

	// creacion de campo del tipo CreacionInformes (Interface) , para la inyeccion
	// de dependencias
	private CreacionInformes informeNuevo;


	//creacion de constructor para la inyeccion de dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Gestiono la nomina de empleados";
	}

	@Override
	public String getInformes() {
		//utilizamos el metodo getInforme de la interface
		return "informe creado por el director " + informeNuevo.getInforme();
	}

}
