package com.exito.certification.exceptions;

public class FailChooseProduct extends AssertionError{

	/*
	 * Clase que muestra la excepci�n cuando un producto no puede ser agregado a la canasta 
	 */
	
	//Previene de errores en la deserializaci�n
	private static final long serialVersionUID = 1L;
	//Creaci�n y declaraci�n del mensaje que se muestra en consola
	private static final String itemOutOfStock = "******THE PRODUCT SELECTED BEFORE IS OUT OF STOCK ******";
	
	
	//M�todo que devuelve el mensaje de la excepci�n
	public static String getFailVisibleProductMessage(){
		return itemOutOfStock ;
	}
	
	//Constructor que llama a la clase padre FailChooseProduct de tipo Assertion Error
	public FailChooseProduct(String message, Throwable cause) {
		super(message, cause);
	}

}
