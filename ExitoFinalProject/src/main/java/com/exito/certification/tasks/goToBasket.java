package com.exito.certification.tasks;

import com.exito.certification.userinterfaces.ExitoBuyPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

/*
 * Clase (tarea) que localiza el icono del carro de compras y le da click
 */
public class goToBasket implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ExitoBuyPage.EXITO_SHOPPING_CART_ICON));	
	}
	
	//Constructor
	public static goToBasket toBuy(){
		return Tasks.instrumented(goToBasket.class);	
	}

}
