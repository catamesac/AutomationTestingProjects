package com.exito.certification.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.exito.certification.userinterfaces.ExitoHomeIcons;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/*
 * Clase Question para verificar si el icono de cabecera del exito es visible 
 * que ayuda a la verificación de la conexión a internet
 */
public class ExitoPage implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		
		//verifica si la cabecera de la pagina principal del exito es visible
			return the(ExitoHomeIcons.EXITO_HOMEPAGE_ICON_VISIBLE).answeredBy(actor).isCurrentlyVisible();
		}

		//Constructor de la clase 
		public static Question<Boolean> isVisible() {
			return new ExitoPage();
		}
	}


