package com.exito.certification.tasks;

import static com.exito.certification.userinterfaces.ExitoSearchPage.EXITO_SELECT_ITEMS;

/*
 * Clase que selecciona de la búsqueda el item aleatorio arrojado por la clase ClickRandomItem 
 */

import com.exito.certification.interactions.ClickRandomItem;
import com.exito.certification.utils.ClosePopUp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

public class ChoosePruduct implements Task {
	
	//Método para que el actor seleccione el producto 
	public <T extends Actor> void performAs(T actor) {
		//Busca si hay publicidad y la cierra
		actor.attemptsTo(ClosePopUp.closeTheWisepop());
		//Baja y busca el Target
		actor.attemptsTo(Scroll.to((EXITO_SELECT_ITEMS)));
		//Dar click al Target
		actor.attemptsTo(ClickRandomItem.myItem(EXITO_SELECT_ITEMS));		
	}

	//Constructor: Método que llama al instrumented para crear una instancia en tiempo de ejecución
	public static ChoosePruduct toBuy() {
		return Tasks.instrumented(ChoosePruduct.class);
	}
	
}


