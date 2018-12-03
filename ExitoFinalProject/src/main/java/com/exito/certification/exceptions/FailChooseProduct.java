package com.exito.certification.exceptions;

public class FailChooseProduct extends AssertionError{

	/*
	 * Clase que muestra la excepción cuando un producto no puede ser agregado a la canasta 
	 */
	
	//Previene de errores en la deserialización
	private static final long serialVersionUID = 1L;
	//Creación y declaración del mensaje que se muestra en consola
	private static final String itemOutOfStock = "******THE PRODUCT SELECTED BEFORE IS OUT OF STOCK ******";
	
	
	//Método que devuelve el mensaje de la excepción
	public static String getFailVisibleProductMessage(){
		return itemOutOfStock ;
	}
	
	//Constructor que llama a la clase padre FailChooseProduct de tipo Assertion Error
	public FailChooseProduct(String message, Throwable cause) {
		super(message, cause);
	}

}
