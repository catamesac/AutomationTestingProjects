package com.exito.certification.models;

/*
 * Clase que me obtiene y me asigana los valores para ingresar en la forma de pago 
 * por medio de tarjeta crédito definidos en el feature
 */
public class PaymentData  {
	
	//Campos para informacion de la forma de pago
	private String cardName;
	private String duesNumber;
	private String cardNumber;

	//Getters y Setter de los campos del la forma de pago
	public PaymentData(String cardName, String duesNumber, String cardNumber) {
		this.cardName = cardName;
		this.cardNumber = cardNumber;
		this.duesNumber = duesNumber;
	}
	
	public String getCardName() {
		return cardName;
	}
	
	public String getDuesNumber() {
		return duesNumber;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}

}