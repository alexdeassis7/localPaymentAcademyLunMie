package com.empresa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//dentro de esta clase guardamos todos los datos pertinentes q la conexion contra la base de datos 
public class Conexion {

	// static : cuando algo es static pertenece a la clase y NO a las instancias

//	nombre de la base 
	static String db = "personas";
	// credenciales de acceso a la base
	static String login = "root";
	static String password = "";
	// string de conexion a la base
	static String url = "jdbc:mysql://localhost/" + db;

	// dentroi de este objeto se persiste todo el estado de nuestra conexion a la
	// base
	Connection conn = null;

	public Conexion() {

		try {
			// obtenemos el driver
			Class.forName("com.mysql.jdbc.Driver");

			// Obtengo un objeto Connection mediante el administrador de conexiones
			conn = DriverManager.getConnection(url, login, password);

			if (conn != null) {
				System.out.println("Se Logro conectar Exitosamente a la Base " + db);
			}

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Conexion connMySql = new Conexion();
	}

}
