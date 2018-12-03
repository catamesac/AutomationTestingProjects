package com.exito.certification.stepdefinitions;
/*
 * Clase para definir los StepDefinitios para seleccionar el producto
 */

import java.util.List;
import org.openqa.selenium.WebDriver;
import com.exito.certification.exceptions.FailChooseProduct;
import com.exito.certification.models.TheProduct;
import com.exito.certification.questions.TheBasket;
import com.exito.certification.tasks.AddProduct;
import com.exito.certification.tasks.ChoosePruduct;
import com.exito.certification.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SelectProductStepDefinition {
	
	//Inicializamos el Driver
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	//Definimos el actor para el método
	private Actor antonio = Actor.named("Antonio");
	
	@Before
	public void setUp() {
		antonio.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^that Antonio search a product frome some brand$")
	public void thatAntonioSearchAProductFromeSomeBrand(List<TheProduct> product) {
		antonio.wasAbleTo(Search.theProduct(product));	    
	}

	@When("^he select a product$")
	public void heSelectAProduct() {	
		antonio.attemptsTo(ChoosePruduct.toBuy());
	}

	@Then("^he should add the item to the basket$")
	public void heShouldAddTheItemToTheBasket() {	
	 antonio.attemptsTo(AddProduct.toTheBasket());
	 antonio.should(seeThat(TheBasket.hasTheProduct()).orComplainWith(FailChooseProduct.class, 
			 FailChooseProduct.getFailVisibleProductMessage()));
	}


}
