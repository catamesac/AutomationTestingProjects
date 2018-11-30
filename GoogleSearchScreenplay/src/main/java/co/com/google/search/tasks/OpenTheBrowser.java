package co.com.google.search.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.google.search.tasks.OpenTheBrowser;
import co.com.google.search.userinterfaces.GoogleHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {

	//Definir el constructor page como objeto de pagina
	private PageObject page = new GoogleHomePage();
	
	//Constructor para asignar valor inicial del PageObject
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	
	//Método que me abre la pagina definida en el userinterfaces
	@Override
	@Step("{0} opens the browser on Google Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
	}
	
	//Método que me abre la pagina definida anteriormete en el browser definifo
	public static OpenTheBrowser at(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);
	}
	

}
