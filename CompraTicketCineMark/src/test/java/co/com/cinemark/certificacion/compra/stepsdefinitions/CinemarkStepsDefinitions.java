package co.com.cinemark.certificacion.compra.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.openqa.selenium.WebDriver;

import co.com.cinemark.certificacion.compra.userinterfaces.CinemarkHomePage;
import co.com.cinemark.certificacion.compra.questions.TheResult;
import co.com.cinemark.certificacion.compra.tasks.Comprar;
import co.com.cinemark.certificacion.compra.tasks.Buscar;
import co.com.cinemark.certificacion.compra.tasks.OpenTheBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CinemarkStepsDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor malory = Actor.named("Malory");
	private CinemarkHomePage cineMarkHomePage;
	
	@Before
	public void setUp() {
		malory.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^Que puedo acceder a Cinemark$")
	public void que_puedo_acceder_a_Cinemark() {
		malory.wasAbleTo(OpenTheBrowser.on(cineMarkHomePage));
	}

	@When("^busco la pelicula (.*) y la selecciono$")
	public void busco_la_pelicula_y_la_selecciono(String arg1) {
		malory.wasAbleTo(Buscar.TheMovie(arg1));
		malory.should(seeThat(TheResult.is(),equalTo(arg1)));
	}

	@Then("^Compro boletos para la pelicula$")
	public void compro_boletos_para_la_pelicula() {
		malory.attemptsTo(Comprar.Boletos());
	}


}
