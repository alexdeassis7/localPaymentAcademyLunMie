package com.prueba.anotations;

import org.springframework.stereotype.Component;

import com.interfaces.CreacionInformesFinancieros;

//esta clase es la dependencia de la clase comercial experiementado 

@Component // registramos la clase en el contenedor de spring
public class InformeFinancieroTrimestre1 implements CreacionInformesFinancieros {

	@Override
	public String getInformeFinanciero() {
		return "esta es una presentacion de un informe financiero del primer trimestre del año 2022";
	}

}
