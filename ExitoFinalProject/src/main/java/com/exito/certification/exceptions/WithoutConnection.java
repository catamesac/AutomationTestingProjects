package com.exito.certification.exceptions;

/*
 * Clase para mostrar la excepción de que no hay conexión para acceder a la página 
 */
public class WithoutConnection extends AssertionError {
	
	//Previene de errores en la deserialización
	private static final long serialVersionUID = 1L;
	
	//Creación y declaración del mensaje que se muestra en consola
	private static final String FAIL_NETWORK_CONNECTION = "****** Without connection to access to the Exito Home Page ******";

	
	//Método que devuelve el mensaje de la excepción
	public static String getFailNetworkMessage() {
		return FAIL_NETWORK_CONNECTION ;
	}
		
	//Constructor que llama a la clase padre WithoutConnection de tipo Assertion Error
		public WithoutConnection(String message, Throwable cause) {
			super(message, cause);
		}
}
