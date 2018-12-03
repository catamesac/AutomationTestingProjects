package com.exito.certification.tasks;
import static com.exito.certification.userinterfaces.ExitoLoginPage.EXITO_LOGIN_ICON;

/*
 * Clase para ingresas a la página del Login
 */
import com.exito.certification.userinterfaces.ExitoLoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



public class GoToLogin implements Task {
	
	@Override //Sobreescribe el método de una clase padre 
	public <T extends Actor> void performAs(T actor) {		
		actor.attemptsTo(Click.on(EXITO_LOGIN_ICON));	
	}
	
	//constructor
	public static GoToLogin inLoginPage(){		
		return Tasks.instrumented(GoToLogin.class);	
	}
	
}
