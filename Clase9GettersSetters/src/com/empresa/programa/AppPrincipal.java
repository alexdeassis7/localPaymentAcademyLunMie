package com.empresa.programa;

import com.empresa.CajaAhorro;

public class AppPrincipal {

	public static void main(String[] args) {

		CajaAhorro caja1 = new CajaAhorro();

		// utlizamos el metodo setters para modificar
		// el valor del atributo saldo
		caja1.setSaldo(1000);

		// utlizamos el metodo getters para conocer
		// el valor del atributo saldo
		System.out.println("getSaldo() :" + caja1.getSaldo());

		// seteamos los valores mediante los metodos setters
		caja1.setNombrePropietario("Gerardo");
		caja1.setNumeroCuenta(787878l);

		// obtenemos los valores de los atributos mediate sus getters

		System.out.println("getNombrePropietario():" + caja1.getNombrePropietario());

		System.out.println("getNumeroCuenta():" + caja1.getNumeroCuenta());

		CajaAhorro caja2 = new CajaAhorro();
		
		caja2.setNombrePropietario("Sebas");
		caja2.setNumeroCuenta(484899l);
		caja2.setSaldo(1500);
		
		System.out.println(caja2.toString());
		
	}
}
