package co.com.google.search.tasks;


import co.com.google.search.userinterfaces.GoogleSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchWord implements Task{


	@Override
	public <T extends Actor> void performAs(T actor) {
	
		//actor.attemptsTo(Click.on(GoogleSearchPage.GOOGLE_CANCEL));
		//Digitamos la palabra que deseamos buscar
		actor.attemptsTo(Enter.theValue("Norway Northen Lights").into(GoogleSearchPage.GOOGLE_SEARCH_BOX));
		
		//Damos click en el botón de búsqueda
		actor.attemptsTo(Click.on(GoogleSearchPage.GOOGLE_SEARCH_BUTTOM));
		
	}

	//Es el método que hace que se ejecute la clase
	public static Performable the() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(SearchWord.class);
	}



}
