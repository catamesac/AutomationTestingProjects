package com.exito.certification.stepdefinitions;

/*
 * Clase para definir los StepDefinitios de la compra
 */
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import com.exito.certification.exceptions.FailPayment;
import com.exito.certification.models.PaymentData;
import com.exito.certification.questions.ExitoPayment;
import com.exito.certification.tasks.FillThePaymentFields;
import com.exito.certification.tasks.SelectAddress;
import com.exito.certification.tasks.goToBasket;

public class BuyProductStepDefinition {
	
	//Definimos el driver a manejar
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor antonio = Actor.named("Antonio");
	
	//Asignar al actor el webDriver
	@Before
	public void setUp() {
		antonio.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that Antonio go to the basket page$")
	public void thatAntonioGoToTheBasketPage() {
		antonio.wasAbleTo(goToBasket.toBuy());    	
	}
	
	@When("^he select the shipping address$")
	public void heSelectTheShippingAddress() {
		antonio.attemptsTo(SelectAddress.toSend());	    
	}
	
	@When("^he select the payment option$")
	public void heSelectThePaymentOption(List<PaymentData> paymentData) {
		antonio.attemptsTo(FillThePaymentFields.withThe(paymentData.get(0)));
	}
		
	@Then("^he should make the purchase$")
	public void heShouldMakeThePurchase() {
	  antonio.should(seeThat(ExitoPayment.isSuccessful()).orComplainWith(FailPayment.class, 
			         FailPayment.getFailPaymentMessage()));	    
	}

}
