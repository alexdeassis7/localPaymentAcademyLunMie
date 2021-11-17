package com.empresa;

public class CajaAhorro {

	// modificadores de acceso:
//	default (package): solamente se pueden acceder desde clases des mismo package
//	public  : se puede acceder desde cualquier punto del programa 
//	protected (este lo veremos junto con la herencia) : se utiliza en mecanismos de herencia
//	private : solo se pueden acceder desde la misma clase o mediante metodos public

	// atributos
	private float saldo;
	private long numeroCuenta;
	private String nombrePropietario;
//	
//	creamos getters y setter para poder restringir el acceso a 
//	los atributos y brindar seguridad a nuestra clase 

	// el metodo getters me permite conocer es valor de un atributo
	// desde fuera de la clase CajaAhorro
	public float getSaldo() {
		return saldo;
	}

	// el metodo setters me permite setear el valor de un atributo privado de
	// la clase CajaAhorro ,
	public void setSaldo(float saldo) {
		if (saldo >= 0) {
			System.out.println("se actualizo el saldo de la caja de ahorro ");
			this.saldo = saldo;
		} else {
			System.out.println("el saldo de la caja de ahorro NO puede ser inferior a cero");
		}
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		if (numeroCuenta <= 999999999) {
			System.out.println("Se seteo el numero de cuenta");
			this.numeroCuenta = numeroCuenta;
		} else {
			System.out.println("el numero de cuenta no puede ser mayor a 999999999");
		}
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	@Override
	public String toString() {
		return "CajaAhorro [saldo=" + saldo + ", numeroCuenta=" + numeroCuenta + ", nombrePropietario="
				+ nombrePropietario + "]";
	}

}
