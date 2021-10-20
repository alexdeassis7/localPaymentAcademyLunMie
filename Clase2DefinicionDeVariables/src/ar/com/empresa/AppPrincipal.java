package ar.com.empresa;

public class AppPrincipal {
	public static void main(String[] args) {

		// definicion de variables : un valor que mutara durante
		// la ejecucion de la app

//		atajo para comentarios : ctrl + shift + c

		// datos primitivos en java
//		byte  127 -+
//		short 150000 -+
//		int   150000000 +-
//		long  150000000000000 -+
//		float 3.1416
//		double 3.1416545454
//		
//		boolean (true o false ) 
//		char un solo caracter por ejemplo '3' ,'$' 'u','k'
//
//		String permite guardar una cadena de caracteres "Av siempre viva"

		// defino una variable de tipo entero
//		tipoDeDato Identificador ;
		// defino e inicializo variable
		int edad = 0; // camel case
		float sueldo = 0;
		double componenteQuimicoSputnik = 0;
		char sexo = 'f';
		boolean esCasado = true ;
		
		// mostramos las variable por pantalla
		System.out.println("--------mostramos los valores de las variables por pantalla --------");
		System.out.println("la edad es : " + edad);
		System.out.println("el sueldo es : " + sueldo);
		System.out.println("el  componente Quimico Sputnik es : " + componenteQuimicoSputnik);
		System.out.println("el sexo es : " + sexo);
		System.out.println("es casado ??? : " + esCasado);
		
		System.out.println("--------modificamos los valores de la variables------ ");
		edad = 18;
		sueldo = 360000.50f;
		componenteQuimicoSputnik = 14.4548;
		sexo = 'm';
		esCasado = false ;
		
		System.out.println("--------mostramos nuevamente los valores de las variables modificados por pantalla --------");
		System.out.println("la edad es : " + edad);
		System.out.println("el sueldo es : " + sueldo);
		System.out.println("el  componente Quimico Sputnik es : " + componenteQuimicoSputnik);
		System.out.println("el sexo es : " + sexo);
		System.out.println("es casado ??? : " + esCasado);
		

	}
}
