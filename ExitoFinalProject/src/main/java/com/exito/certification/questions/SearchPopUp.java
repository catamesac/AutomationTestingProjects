package com.exito.certification.questions;

/*
*Clase que implementa el método question para verificar si se presenta alguna publicidad en ventanas emergentes
*/

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import com.exito.certification.userinterfaces.ExitoSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SearchPopUp implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		
	 //El actor busca si hay publicidad visible
		return the(ExitoSearchPage.EXITO_WISEPOP_CLOSE).answeredBy(actor).isCurrentlyVisible();
	}
	
	//Cosntrucutor de la clase 
	public static SearchPopUp isDetected() {
		return new SearchPopUp();
	}

}
