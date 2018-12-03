package com.exito.certification.tasks;

/*
 * Clase que ingresa la informacion tomada del feature a los campos de m�todo de pago
 */

import com.exito.certification.models.PaymentData;
import com.exito.certification.userinterfaces.ExitoBuyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

public class FillThePaymentFields implements Task{
	//Defino la lista que obtendra los datos
    private PaymentData paymentDataFill;
	
    //Defino la interfaz que me otorga los Target
	private ExitoBuyPage exitoBuyPage;
	
	//Declaro el set que me obtiene los datos de la lista 
	public FillThePaymentFields(PaymentData paymentDataFill) {
		
		this.paymentDataFill = paymentDataFill;
	}
	
	@Override
	//Paso que define un orden para realizar las acciones definidas en el feature
	@Step("{0} fill the payment fills on Exito payment Page")
	public <T extends Actor> void performAs(T actor) {
		
		//Actor busca el m�todo de pago y le da click. Adem�s ingresa los datos del m�todo de pago
		actor.attemptsTo(Scroll.to(exitoBuyPage.EXITO_CREDIT_CARD_CHOOSE));	
		actor.attemptsTo(Click.on(exitoBuyPage.EXITO_CREDIT_CARD_CHOOSE),
				Enter.theValue(paymentDataFill.getCardName()).into(exitoBuyPage.EXITO_CARD_ID_BOX),
				SelectFromOptions.byVisibleText(paymentDataFill.getDuesNumber().toUpperCase()).from(exitoBuyPage.EXITO_CARD_DUES),//Selector para menu desplegable numero de cuotas
				Enter.theValue(paymentDataFill.getCardNumber()).into(exitoBuyPage.EXITO_CARD_NUMBER_BOX),
				Click.on(exitoBuyPage.EXITO_PAYMENT_CONFIRMATION_BUTTON));	
		
	}
	
	//Constructor: M�todo que llama al instrumented para crear una instancia en tiempo de ejecuci�n
	public static FillThePaymentFields withThe(PaymentData payDataFill) {
		return Tasks.instrumented(FillThePaymentFields.class, payDataFill);
	}


}
