package com.exito.certification.tasks;

import static com.exito.certification.userinterfaces.ExitoSearchPage.ADD_ONE_MORE_ARTICLE;
import static com.exito.certification.userinterfaces.ExitoSearchPage.ADD_TO_SHOPPING_CART;

/*
 * Clase que adiciona un articulo más y adicina los articulos al carro de compras
 */
import com.exito.certification.userinterfaces.ExitoSearchPage;
import com.exito.certification.utils.ClosePopUp;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class AddProduct implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		//El actor cierra la ventana emergente si la detecta
		actor.attemptsTo(ClosePopUp.closeTheWisepop());
		
		//EL actor busca los botones y les da click
		actor.attemptsTo(Scroll.to((ADD_ONE_MORE_ARTICLE)),
						 Click.on(ADD_ONE_MORE_ARTICLE),
						 Scroll.to(ADD_TO_SHOPPING_CART),
						 Click.on(ADD_TO_SHOPPING_CART));
		
	}
	
	//Constructor: Método que llama al instrumented para crear una instancia en tiempo de ejecución
	public static AddProduct toTheBasket() {
		return Tasks.instrumented(AddProduct.class);
	}

}
