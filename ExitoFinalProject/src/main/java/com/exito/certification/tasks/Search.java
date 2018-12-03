package com.exito.certification.tasks;
/*
 * Clase que ingresa la informacion del producto a buscar en la casilla de búsqueda
 */
import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import com.exito.certification.models.TheProduct;
import com.exito.certification.userinterfaces.ExitoSearchPage;

public class Search implements Task {
	
	//Declaro el tipo de producto 
	private List<TheProduct> theProduct;
	//Declaro la interfaz de la que voy a obtener los Target
	private ExitoSearchPage exitoSearchPage;
	
	
	//Declaro el set que me obtiene los datos de la lista 
	public Search(List<TheProduct> theProduct) {
			this.theProduct = theProduct;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		 //Se escribe el termino a buscar obtenido del feature y le doy click a buscar
		actor.attemptsTo(Enter.theValue(theProduct.get(0).getProduct()).into(exitoSearchPage.EXITO_SEARCH_BOX));
		actor.attemptsTo(Click.on(exitoSearchPage.EXITO_SEARCH_BUTTON));	
	
	}
	
	//Constructor: Método que llama al instrumented para crear una instancia en tiempo de ejecución
	public static Search theProduct(List<TheProduct> product) {
		return Tasks.instrumented(Search.class, product);
	}

}
