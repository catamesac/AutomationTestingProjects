package co.com.bancolombia.certification.googlesuite.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;;

//Para convertir esta clase en tarea se le adiciona el implements Task
public class OpenTheBrowser implements Task {

	private PageObject page;

public OpenTheBrowser(PageObject page) {
	//le damos valos al atributo de clase page (en azul)
	this.page = page;
}
	//Método de la interfaz OpenTheBrowse que es performAs: No devuelve nada y recibe al actor 
	@Override
	@Step("{0} opens the browser on Google Home Page") //Las llaves me traen el nombre del actor: Susan en este caso
	public <T extends Actor> void performAs(T actor) {
		
		//dentro de este método van todas las interacciones para cumplir con la tarea
		actor.attemptsTo(Open.browserOn(page));
	}

	public static OpenTheBrowser on(PageObject page) {		
		//Instrumented por debajo llama el constructor de la clase que se ajuste a los parámetros
		//Es decir que va a la clase OpenTheBrowser y busca un constructor que reciba page
		return instrumented(OpenTheBrowser.class, page);
	}
	
	
	

}
