package com.exito.certification.utils;


/*
 * Clase que busca si esta la ventana emergente de publicidad y la cierra
 */

import com.exito.certification.questions.SearchPopUp;
import com.exito.certification.userinterfaces.ExitoSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClosePopUp implements Task{
	
	private ExitoSearchPage exitoSearchPage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		//Mira si hay ventana emergente de publicidad y si la encuentra la cierra
		if(actor.asksFor(SearchPopUp.isDetected())) {	
		actor.attemptsTo(Click.on(exitoSearchPage.EXITO_WISEPOP_CLOSE));
		}
	}
	//Constructor: Método que llama al instrumented para crear una instancia en tiempo de ejecución
	public static ClosePopUp closeTheWisepop() {
		return Tasks.instrumented(ClosePopUp.class);
	}

}
