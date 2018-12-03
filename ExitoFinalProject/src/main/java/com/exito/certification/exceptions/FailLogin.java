package com.exito.certification.exceptions;

public class FailLogin extends AssertionError {

	/*
	 * Clase para mostrar la excepci�n de un login fallido 
	 */
	
	//Previene de errores en la deserializaci�n
	private static final long serialVersionUID = 1L;
	
	//Creaci�n y declaraci�n del mensaje que se muestra en consola
	private static final String failLogin = "-------XXXX LOGIN FAIL: Username or Password was wrong  XXXX-------";
	
	//M�todo que devuelve el mensaje de la excepci�n
	public static String getfailureLoginMessage() {
		return failLogin;
	}
	//Constructor que llama al constructor de la clase padre (FailLogin) AssertionError
	public FailLogin(String message, Throwable cause) {
		super(message, cause);
	}



}
