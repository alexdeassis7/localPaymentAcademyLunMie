package com.empresa;
//Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y 

//segundos de un día desde las 0:0:0 hasta las 23:59:59

public class AppPrincipal {

	public static void main(String[] args) {

		
		for (int hs = 0; hs <= 23; hs++) {// imprime las horas

			for (int min = 0; min <= 59; min++) {// imprime las minutos

				for (int seg = 0; seg <= 59; seg++) {// imprime las segundos

					System.out.println(hs + ":" + min + ":" + seg);

				}

			}

		}
	}

}
