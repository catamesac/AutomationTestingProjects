package co.com.cinemark.certificacion.compra.questions;

import co.com.cinemark.certificacion.compra.userinterfaces.CinnemarkComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String>{
	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(CinnemarkComponents.PELICULA).viewedBy(actor).asString();
		
	}


	public static Question<? extends String> is() {
		// TODO Auto-generated method stub
		return new TheResult();
	}

}
