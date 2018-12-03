package com.exito.certification.questions;
/*
*Clase que implementa el método question para verificar si la compra fue exitosa
*/
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.exito.certification.userinterfaces.ExitoBuyPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ExitoPayment implements Question<Boolean>{
	
	//Defino el mensaje de compra exitosa que sacará si visualiza el formato del resumen de la compra
	private static String sucessPaymentMessage = "-----YOU PAYMENT WAS SUCCESSFUL, CONGRATULATION-----";
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		//Verifico si se genero compra, validando la visibilidad del formato de compra
		return the(ExitoBuyPage.EXITO_PAYMENT_CONFIRMATION).answeredBy(actor).isCurrentlyVisible();
	
	}
	
	//Constructor de la clase 
	public static Question<Boolean> isSuccessful( ) {
		return new ExitoPayment();
	}
	
	//constructor de la clase que devuelve el mesaje de fallo
	public static String getSuccessLoginMessage() {
		return sucessPaymentMessage;
	}
}
