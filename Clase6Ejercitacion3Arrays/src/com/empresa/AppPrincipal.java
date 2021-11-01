package com.empresa;

//Calcular el promedio de 50 valores almacenados en un Vector. Determinar además 
//cuantos son mayores que el promedio, imprimir el promedio, el número de datos mayores 
//que el promedio y una lista de valores mayores que el promedio .

public class AppPrincipal {

	public static void main(String[] args) {
		// defino los vectores
		float[] arrayValores = new float[50]; // defino e inicializo
		float[] arrayDeValoresMayoresAlPromedio; // defino

		// definos las variables de trabajo
		float sumatoria = 0, promedio = 0;
		int cantidadDeDatosMayoresAlPromedio = 0;

		// cargamos el vector de manera aleatoria
		for (int i = 0; i < arrayValores.length; i++) {
			// ulizamos el casteo explicito para comvertir un Double a un float "(float)"
			arrayValores[i] = (float) (Math.random() * 100 + 1);
			// acumulo todos lo valores del array en la variable sumatoria
			sumatoria += arrayValores[i];
		}

		promedio = sumatoria / arrayValores.length; // calculo el promedio
		System.out.println("El promedio de los valores del array es : " + promedio);

		// recorro el array y contamos cuantos datos son mayores al promedio!
		for (int i = 0; i < arrayValores.length; i++) {
			if (arrayValores[i] > promedio) {
				cantidadDeDatosMayoresAlPromedio++;
			}
		}
		// le damos el tamaño al vector en base a la cantidad de datos que son
		// superiores al promedio
		arrayDeValoresMayoresAlPromedio = new float[cantidadDeDatosMayoresAlPromedio];

		// defino un indice para el arrayDeValoresMayoresAlPromedio
		int j = 0;

		// recorro el array de valores
		for (int i = 0; i < arrayValores.length; i++) {
			if (arrayValores[i] > promedio) {
				// copiamos el datos superior al promedio a arrayDeValoresMayoresAlPromedio
				arrayDeValoresMayoresAlPromedio[j] = arrayValores[i];
				j++;
			}
		}

		System.out.println("La cantidad de datos mayores al promedio es : " + cantidadDeDatosMayoresAlPromedio);
		System.out.println("array de valores :");
		// recorro el array de valores
		for (int i = 0; i < arrayValores.length; i++) {
			System.out.print(arrayValores[i] + " - ");
		}
		System.out.println();
		System.out.println("estos son los datos del vector que tiene los valores mayores que el promedio :");
		// recorro el array de valores mayores al promedio
		for (int i = 0; i < arrayDeValoresMayoresAlPromedio.length; i++) {
			System.out.print(arrayDeValoresMayoresAlPromedio[i] + " - ");
		}

	}

}
