package co.com.cinemark.certificacion.compra.tasks;

import co.com.cinemark.certificacion.compra.userinterfaces.CineMarkPantallaDeCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Comprar implements Task{
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(CineMarkPantallaDeCompra.CINE_HORA));
		actor.attemptsTo(Click.on(CineMarkPantallaDeCompra.BOTON_SELECCIONAR));
		actor.attemptsTo(Click.on(CineMarkPantallaDeCompra.CONTINUAR_COMO_USUARIO));
		actor.attemptsTo(Enter.theValue("Catalina").into(CineMarkPantallaDeCompra.NOMBRE));
		actor.attemptsTo(Enter.theValue("Sophos").into(CineMarkPantallaDeCompra.APELLIDO));
		actor.attemptsTo(Enter.theValue("cata@sophos.com").into(CineMarkPantallaDeCompra.EMAIL));
		actor.attemptsTo(Enter.theValue("1231231").into(CineMarkPantallaDeCompra.PHONE));
		actor.attemptsTo(Enter.theValue("532133424").into(CineMarkPantallaDeCompra.DOCUMENTO));
		actor.attemptsTo(Click.on(CineMarkPantallaDeCompra.BOTON));
		actor.attemptsTo(Click.on(CineMarkPantallaDeCompra.NRO_BOLETAS));
		actor.attemptsTo(Click.on(CineMarkPantallaDeCompra.NRO_BOLETAS2));
		actor.attemptsTo(Click.on(CineMarkPantallaDeCompra.BOTON_CONTINUAR1));
		actor.attemptsTo(Click.on(CineMarkPantallaDeCompra.SILLA));
		actor.attemptsTo(Click.on(CineMarkPantallaDeCompra.BOTON_CONTINUAR));
	}

	public static Comprar Boletos() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Comprar.class);
		
	}

}
