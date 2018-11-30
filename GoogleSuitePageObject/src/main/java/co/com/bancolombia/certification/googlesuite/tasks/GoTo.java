package co.com.bancolombia.certification.googlesuite.tasks;

import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleAppsComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
/*
 * Clase que selecciona del cuadro de aplicaciones de google la opcion de traductor
 */
public class GoTo implements Task {
	
	private Target googleApp;
	
	public GoTo(Target googleApp) {
		//Damos valor a la variable googleApp
		this.googleApp = googleApp;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		//Cuando aparece un pop up en google se utiliza, no siempre es visible
		//actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_CANCEL));
		//actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_CLICK_HOME));
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS));
		actor.attemptsTo(Click.on(googleApp));
	}

	public static GoTo theApp(Target googleApp) {
		// TODO Auto-generated method stub
		return instrumented(GoTo.class, googleApp);
	}

}
