package com.exito.certification.tasks;

import static com.exito.certification.userinterfaces.ExitoBuyPage.EXITO_CONTINUE_BUTTON;
import static com.exito.certification.userinterfaces.ExitoBuyPage.EXITO_SHIPPING_ADDRESS_SELECT;

/*
 * Clase selecciona la dirección de envio
 */

import com.exito.certification.userinterfaces.ExitoBuyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class SelectAddress implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		//Selecciona la direccion de envio y le da click a continuar
		actor.attemptsTo(Click.on(EXITO_SHIPPING_ADDRESS_SELECT));
		actor.attemptsTo(Scroll.to((EXITO_CONTINUE_BUTTON)));
		actor.attemptsTo(Click.on(EXITO_CONTINUE_BUTTON));		
	}
	
	//Constructor: Método que llama al instrumented para crear una instancia en tiempo de ejecución
	public static SelectAddress toSend() {
		return Tasks.instrumented(SelectAddress.class);
	}
	

}
