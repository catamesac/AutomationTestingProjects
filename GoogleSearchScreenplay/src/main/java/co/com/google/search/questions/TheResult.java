package co.com.google.search.questions;

import co.com.google.search.userinterfaces.GoogleSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String> {

	//Metodo que retorna el string capturado por el actor en la casilla de búsqueda 
	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(GoogleSearchPage.GOOGLE_SEARCH_BOX).viewedBy(actor).asString();
		
	}


	public static Question<? extends String> is() {
		// TODO Auto-generated method stub
		return new TheResult();
	}

}
