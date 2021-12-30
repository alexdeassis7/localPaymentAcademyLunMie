package com.empresa;

public class SecretarioEmpleado implements Empleados {

	private CreacionInformes informeNuevo;

	@Override
	public String getTareas() {
		return "Soy un secretario y me gusta obedecer ordenes de mis superiores";
	}

	@Override
	public String getInformes() {
		return "";
	}

	// Inyeccion de dependencia mediante el sstters
	// generamos un setter para poder usar la inyeccion de dependencias mediante el
	// tag "property "

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

}
