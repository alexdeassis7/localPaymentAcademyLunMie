package com.empresa;

//clase hija que hereda todo los metodos y atributo pulbic y protected de la clase padre Vuelo
public class VueloCarga extends Vuelo {

	public int asientos = 12 ;
	public float espacioMaximoCarga = 1000; //pies cubicos de espacio en nuestra bodega 
	public float espacioCargaUsado;
	
	//metodo que me permite agregar un paquete al avion 
	public void agregarPaquete(float altura , float ancho , float profundidad) {
		double size = altura * ancho * profundidad ;
		
		if(espacioDeCargaDisponible(size)) {
			System.out.println("se cargo su paquete a la bodega del avion");
			espacioCargaUsado += size ;
		}else {
			faltaEspacio();
		}
		
	}
	
	private boolean espacioDeCargaDisponible(double tamanio) {
		return espacioCargaUsado + tamanio <= espacioMaximoCarga ;
	}
	
	private void faltaEspacio() {
		System.out.println("no tenemos mas espacio en la bodega del avion para llevar su paquete");
	}
	
	//písamos un metodo de la clase padre para que se comporte de otra manera 
	@Override  //anotacion
	public int getAsiento() {
		return 12 ;
	}
	
}
