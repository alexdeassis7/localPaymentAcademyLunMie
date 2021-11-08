package com.empresa;

public class AppPrincipal {

	// metodo principal
	public static void main(String[] args) {
		System.out.println("invocamos procedimiento");
		// invocamos desde nuestro metodo principal al metodo ejecutar()
		ejecutar();
		System.out.println("termino de ejecutarse el procedimiento");
		System.out.println("invocamos procedimiento que recibe parametros");
		// invocamos desde nuestro metodo principal al metodo ejecutar()
		ejecutarConParametros(40, 48);
		System.out.println("termino  el procedimiento que recibe parametros");
		System.out.println("invocamos procedimiento que recibe parametros");
		// invocamos desde nuestro metodo principal al metodo ejecutar()
		ejecutarConParametros(500, 400);
		System.out.println("termino  el procedimiento que recibe parametros");
		System.out.println("invocamos procedimiento que recibe parametros");
		// invocamos desde nuestro metodo principal al metodo ejecutar()
		ejecutarConParametros(600, 650);
		System.out.println("termino  el procedimiento que recibe parametros");

		// -----------------------------------------Calculamos iva invocando a una
		// funcion
		System.out.println("invocamos a la funcion calcularIva()");
		double valorRetornadoPorLaFuncion = calcularIva(1000);
		System.out.println("el iva que se calculo es : " + valorRetornadoPorLaFuncion);

		System.out.println("invocamos a la funcion calcularIva()");
		
		System.out.println("el iva que se calculo es : " + calcularIva(500));

		System.out.println("Fin de la Application");

	}

	// defino mi primer procedimiento un procedimiento realizar una tarea
	// particular sin retornar ningun valor cuando es imvocado
	// no recibe parametros
	public static void ejecutar() {
		// cuerpo del metodo
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	// procedimiento con parametros
	public static void ejecutarConParametros(int inicio, int fin) {
		if (inicio < fin) {
			for (int i = inicio; i <= fin; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("Rango invalido! inicio debe ser inferios al fin ");
		}
	}

	// ---------------------------------------- Funciones
	// - recibe un parametro entero y retorna un valor double al finalizar su
	// ejecucion
	public static double calcularIva(int valor) {
		// cuerpo de nuestra funcion
		double porcentaje = 0.21;
		double resultado = valor * porcentaje;
		return resultado;

	}

}
