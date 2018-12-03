package com.exito.certification.interactions;

/*
 * Clase para arroja aleatoriamente un item de la búsqueda obtenida
 */
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;


public class ClickRandomItem implements Interaction {
	
	//Declaramos el Target que va a capturar los productos arrojados por la búsqueda
	private Target allItems;
	
	//Declaramos la variable que va a obtener el número random que debe buscar el actor en la ista arrojada 
	int itemPosition = Math.toIntExact(Math.round(Math.random()*10)+1);
	
	//Constructor que obtiene el target
	public ClickRandomItem (Target allItems) {
		this.allItems= allItems;
		
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		//Hacemos que seleccione de la tabla un aleatorio. En el get va el número que va a seleccionar 
		allItems.resolveAllFor(actor).get(itemPosition).click();	
		
	}
	
	//Método que llama al instrumented para crear una instancia en tiempo de ejecución, con el parametro de tipo allItems
	public static ClickRandomItem myItem(Target allItems) {

		return Tasks.instrumented(ClickRandomItem.class, allItems);
			
	}
   
}
