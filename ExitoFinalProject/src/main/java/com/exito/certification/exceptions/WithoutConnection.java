package com.exito.certification.exceptions;

/*
 * Clase para mostrar la excepci�n de que no hay conexi�n para acceder a la p�gina 
 */
public class WithoutConnection extends AssertionError {
	
	//Previene de errores en la deserializaci�n
	private static final long serialVersionUID = 1L;
	
	//Creaci�n y declaraci�n del mensaje que se muestra en consola
	private static final String FAIL_NETWORK_CONNECTION = "****** Without connection to access to the Exito Home Page ******";

	
	//M�todo que devuelve el mensaje de la excepci�n
	public static String getFailNetworkMessage() {
		return FAIL_NETWORK_CONNECTION ;
	}
		
	//Constructor que llama a la clase padre WithoutConnection de tipo Assertion Error
		public WithoutConnection(String message, Throwable cause) {
			super(message, cause);
		}
}
