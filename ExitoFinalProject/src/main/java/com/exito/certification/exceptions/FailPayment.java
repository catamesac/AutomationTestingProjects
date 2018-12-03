package com.exito.certification.exceptions;

/*
 * Clase que me muestra el error de que no se pudo realizar la compra
 */
public class FailPayment extends AssertionError {
	
	//Previene de errores en la deserialización
	private static final long serialVersionUID = 1L;
	
	//Creación y declaración del mensaje que se muestra en consola
	private static final String FAIL_PAYMENT = "******the purchase couldn´t be made it ******";

	//Método que devuelve el mensaje de la excepción
	public static String getFailPaymentMessage() {
		return FAIL_PAYMENT ;
	}

	//Constructor que llama al constructor de la clase padre FailPayment AssertionError
	public FailPayment(String message, Throwable cause) {
		super(message, cause);
	}

}
