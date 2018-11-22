package co.com.cinemark.certificacion.compra.tasks;

import co.com.cinemark.certificacion.compra.userinterfaces.CinnemarkComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Buscar implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CinnemarkComponents.CANCEL_HOME_BOX));
		actor.attemptsTo(Click.on(CinnemarkComponents.ACCEPT_BUTTOM_HOME_PAGE));
		actor.attemptsTo(Click.on(CinnemarkComponents.SELECT_MOVIE_TEXTBOX_HOME_PAGE));
		actor.attemptsTo(Click.on(CinnemarkComponents.PELICULA));
	}
	
	public static Buscar TheMovie(String pelicula) {
		return Tasks.instrumented(Buscar.class, pelicula);
	}

}
