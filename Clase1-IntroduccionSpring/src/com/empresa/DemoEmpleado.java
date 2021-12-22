package com.empresa;

public class DemoEmpleado {

	public static void main(String[] args) {

		
		//creamos un objeto de tipo empleado 
		
		JefeEmpleado e1 = new JefeEmpleado();
		
		
		//me creo una referencia a la abstraccion 
		
		Empleados e2 = new JefeEmpleado();

		Empleados e3 = new SecretarioEmpleado();
	}

}
