package co.com.bancolombia.certification.googlesuite.questions;

import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String> {

	//Método que captura la palabra en el cuadro de resultado de la traducción 
	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(GoogleTranslatePage.TARGET_LANGUAGE_RESULT).viewedBy(actor).asString();
	}


	public static Question<? extends String> is() {
		// TODO Auto-generated method stub
		return new TheResult();
	}

}
