package com.empresa;

//tarea hacer una clase padre llamada "persona" con nombre , apellido , edad , numDocumento 

//crear en el main un array de paseenger y probar que todos los metodos y atributos funcionen 
//correctamente 
public class Passenger {

	private int bolsos ; 
	private int bolsosPagos ;
	private double tarifaXbolso; 
	private double totalaPagar;
	private int totalEquipaje;

	//constructor 1 vacio
	public Passenger() {
	}

	//constructor 2 con un parametro  que llama al constructor 4 private 
	public Passenger(int bolsos) {
		//operador ternario o if else inline 
		this(bolsos > 1 ? 50.0d : 25.0d );//invocamos al contructor 4	
		this.bolsos = bolsos;
		totalaPagar = bolsos * tarifaXbolso;
		totalaPagar = bolsos;
	}

	//constructor 3 con dos parametro  , estye llama al constructor 2 que a su vez invoca al constructor 4 private 
	public Passenger(int bolsos, int bolsosPagos) {
		this(bolsos);
		this.bolsosPagos = bolsosPagos;
		totalEquipaje = bolsos + bolsosPagos;
		totalaPagar = bolsos * tarifaXbolso ;
	}
	
	//metodo constructor 4 encargado de setear la tarifa por bolso 
	//lo hacemos private para darle seguridad al sistema y que no se pueda modificar el valor de la tarifa por bolse 
	//ya que la clase tiene la inteligencia de realizarlo
	private Passenger(double tarifaXBolso) {
		this.tarifaXbolso = tarifaXBolso ;
	}

	public int getBolsosGratis() {
		return bolsos;
	}

	public int getBolsosPagos() {
		return bolsosPagos;
	}

	public double getTarifaXbolso() {
		return tarifaXbolso;
	}

	public double getTotalaPagar() {
		return totalaPagar;
	}

	public int getTotalEquipaje() {
		return totalEquipaje;
	}


	//para usar este metodo poner :
	//Passenger[]  listaPasajeros;
	//Passenger.mostrarListaPasajeros(listaPasajeros)
	public static void mostrarListaPasajeros(Passenger listaPasajeros[]) {
		for(Passenger aux : listaPasajeros) {
			System.out.println("***************************************************");
			//aca de tarea mostrar el atributo nombre de la clase padre 
			System.out.println("TARIFA POR BOLSO $ " + aux.getTarifaXbolso());
			System.out.println("Total a pagar $ " + aux.getTotalaPagar());
			System.out.println("Total Bolsos : " + aux.getTotalEquipaje());
		}
	}
	
	
	
	
	
}
