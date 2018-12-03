package com.exito.certification.tasks;

import static com.exito.certification.userinterfaces.ExitoLoginPage.EXITO_LOGIN_BUTTON;
import static com.exito.certification.userinterfaces.ExitoLoginPage.EXITO_PASSWORD_BOX;
import static com.exito.certification.userinterfaces.ExitoLoginPage.EXITO_USERNAME_BOX;

/*
 * Clase que ingresa los datos de usuario y contraseña en la página de Login
 */
import java.util.List;

import com.exito.certification.models.LoginData;
import com.exito.certification.userinterfaces.ExitoLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillTheFields implements Task {
	
	//Defino la lista que obtendra los datos
	private List<LoginData> loginDataFill;
	
	//Declaro el set que me obtiene los datos de la lista 
	public FillTheFields(List<LoginData> loginDataFill) {
		
		this.loginDataFill = loginDataFill;
	}

	@Override
	//Obtengo los datos capturados en el model para llenar los campos de usuario y contraseña
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(loginDataFill.get(0).getUsername()).into(EXITO_USERNAME_BOX),
						 Enter.theValue(loginDataFill.get(0).getPassword()).into(EXITO_PASSWORD_BOX),
						 Click.on(EXITO_LOGIN_BUTTON));	
	}
	
	//Método que llama al instrumented para crear una instancia en tiempo de ejecución, con el parametro de tipo loginDataFill
	public static FillTheFields inThe(List<LoginData> loginDataFill) {
		return Tasks.instrumented(FillTheFields.class, loginDataFill);
	}

}


