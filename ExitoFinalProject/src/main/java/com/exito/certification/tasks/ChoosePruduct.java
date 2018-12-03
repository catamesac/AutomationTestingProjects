package com.exito.certification.tasks;

/*
 * Clase que selecciona de la b�squeda el item aleatorio arrojado por la clase ClickRandomItem 
 */

import com.exito.certification.interactions.ClickRandomItem;
import com.exito.certification.userinterfaces.ExitoSearchPage;
import com.exito.certification.utils.ClosePopUp;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

public class ChoosePruduct implements Task {
	
	//Declaro la variable que heredara los atributos de la clase ExitoSearchPage del paquete user interfaces
	private ExitoSearchPage exitoSearchPage;
	
	//M�todo para que el actor seleccione el producto 
	public <T extends Actor> void performAs(T actor) {
		//Busca si hay publicidad y la cierra
		actor.attemptsTo(ClosePopUp.closeTheWisepop());
		//Baja y busca el Target
		actor.attemptsTo(Scroll.to((exitoSearchPage.EXITO_SELECT_ITEMS)));
		//Dar click al Target
		actor.attemptsTo(ClickRandomItem.myItem(exitoSearchPage.EXITO_SELECT_ITEMS));		
	}

	//Constructor: M�todo que llama al instrumented para crear una instancia en tiempo de ejecuci�n
	public static ChoosePruduct toBuy() {
		return Tasks.instrumented(ChoosePruduct.class);
	}
	
}


