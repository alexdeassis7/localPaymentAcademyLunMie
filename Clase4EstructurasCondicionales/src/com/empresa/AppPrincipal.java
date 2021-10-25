package com.empresa;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
//		Estructura Repetitiva While (mientras)

		/*int contador = 0;

		System.out.println("Inicio del While");

		while (contador < 10) { // LOOP INFINITO! - sucede cuando la condicion nunca pasa a ser false!
			// cuerpo del while
			System.out.println("Hola amigues " + contador);
			contador++; // es igual a escribir : contador = contador + 1 ; o hacer esto contador += 1 ;
		}

		System.out.println("Fin del While");
*/
		// Ejercicio DEMO : calcular el promedio de las temperaturas maximas de Octubre
		System.out.println("Inicio de la app");
		Scanner teclado = new Scanner(System.in);

		int x = 1 ;
		float temperaturaMaximaDelDia = 0 , sumatoriaDeTemperaturas = 0 , promedioDeTemperaturasMaximas = 0 ;
		final int cantidadDeDiasDelMes = 31 ;

		//solicitamos las tempreaturas maximas al usuario
		while (x <= cantidadDeDiasDelMes) {
			System.out.println("Ingrese la temperatura maxima del dia " + x + " de octubre");
			temperaturaMaximaDelDia = teclado.nextFloat();
			sumatoriaDeTemperaturas = sumatoriaDeTemperaturas + temperaturaMaximaDelDia;
			x++;
		}
		
		//calculamos el promedito de temperaturas
		promedioDeTemperaturasMaximas = sumatoriaDeTemperaturas / cantidadDeDiasDelMes ;
		
		//mostramos el resultado 
		System.out.println("El promedio de temperaturas masximas de Octubre es de " + promedioDeTemperaturasMaximas);
		
		System.out.println("Fin de la app");
	}

}
