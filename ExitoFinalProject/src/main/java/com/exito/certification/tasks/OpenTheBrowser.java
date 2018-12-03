package com.exito.certification.tasks;

/*
 * Clase para abrir el navegador
 */
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.exito.certification.exceptions.WithoutConnection;
import com.exito.certification.questions.ExitoPage;
import com.exito.certification.userinterfaces.ExitoHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {

	ExitoHomePage exitoHome;

	
	@Override
	@Step("{0} opens the browser on Exito HomePage")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(exitoHome));
		// Verifica que efectivamente se abre la pagina, de lo contrario arroja un
		// AssertionError
		actor.should(seeThat(ExitoPage.isVisible()).orComplainWith(WithoutConnection.class, WithoutConnection.getFailNetworkMessage()));
	}
	
	public static OpenTheBrowser on(PageObject page) {
		//A través de intrumented llamo al constructor OpenTheBrowser que recibe por parametro la página
		return instrumented(OpenTheBrowser.class, page);
		
	}

}
