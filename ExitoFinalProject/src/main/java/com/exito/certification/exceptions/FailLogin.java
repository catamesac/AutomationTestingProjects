package com.exito.certification.exceptions;

public class FailLogin extends AssertionError {

	/*
	 * Clase para mostrar la excepción de un login fallido 
	 */
	
	//Previene de errores en la deserialización
	private static final long serialVersionUID = 1L;
	
	//Creación y declaración del mensaje que se muestra en consola
	private static final String failLogin = "-------XXXX LOGIN FAIL: Username or Password was wrong  XXXX-------";
	
	//Método que devuelve el mensaje de la excepción
	public static String getfailureLoginMessage() {
		return failLogin;
	}
	//Constructor que llama al constructor de la clase padre (FailLogin) AssertionError
	public FailLogin(String message, Throwable cause) {
		super(message, cause);
	}



}
