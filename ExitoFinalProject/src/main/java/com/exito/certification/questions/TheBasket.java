package com.exito.certification.questions;

/*
*Clase que implementa el método question para verificar si el producto no esta agotado
*/
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import com.exito.certification.userinterfaces.ExitoSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheBasket implements Question<Boolean>{
	
	private static String AddProductMessage = "-----THE PRODUCT WASN´T ADD TO THE SHOPPING CART -----";

	@Override
	public Boolean answeredBy(Actor actor) {
		
		//El actor verifica que el boton de adicionar item es visible 
		return the(ExitoSearchPage.ADD_TO_SHOPPING_CART).answeredBy(actor).isVisible();
	}
	
	//Constructor
	public static Question<Boolean> hasTheProduct( ) {
		return new TheBasket();
	}
	
	//constructor de la clase que devuelve el mensaje
	public static String getAddProductMessage() {
		return AddProductMessage ;
	}
}
