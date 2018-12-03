package com.exito.certification.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import com.exito.certification.userinterfaces.ExitoLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
/*
*Clase que implementa el método question para verificar si el login fue existoso
*/

public class ExitoLogin implements Question<Boolean>{
	
	//Defino el mesaje de error que sacara si el formato que busca al hacer el login no es visible para el actor
	private static String failLoginMessage = "--USERNAME OR PASSWORD ARE WRONG--";

	@Override
	public Boolean answeredBy(Actor actor) {
		
		//El actor busca si el formato de la información de actualización de la pagina login es visible
		return the(ExitoLoginPage.EXITO_UPDATE_INFORMATION_FORM).answeredBy(actor).isVisible();
	}
	
	//Constructor de la clase 
	public static ExitoLogin isSuccessful() {
		return new ExitoLogin();
	}

	//constructor de la clase que devuelve el mesaje de fallo
	public static String getFailLoginMessage() {
		return failLoginMessage;
	}

}
