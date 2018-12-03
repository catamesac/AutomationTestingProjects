package com.exito.certification.tasks;

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
	//Declaro la interfaz de la que voy a obtener los Target
	private ExitoBuyPage exitoBuyPage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		//Selecciona la direccion de envio y le da click a continuar
		actor.attemptsTo(Click.on(exitoBuyPage.EXITO_SHIPPING_ADDRESS_SELECT));
		actor.attemptsTo(Scroll.to((exitoBuyPage.EXITO_CONTINUE_BUTTON)));
		actor.attemptsTo(Click.on(exitoBuyPage.EXITO_CONTINUE_BUTTON));		
	}
	
	//Constructor: Método que llama al instrumented para crear una instancia en tiempo de ejecución
	public static SelectAddress toSend() {
		return Tasks.instrumented(SelectAddress.class);
	}
	

}
