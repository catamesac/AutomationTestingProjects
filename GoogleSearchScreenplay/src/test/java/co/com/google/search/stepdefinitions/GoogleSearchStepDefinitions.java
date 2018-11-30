package co.com.google.search.stepdefinitions;

import org.openqa.selenium.WebDriver;
import co.com.google.search.questions.TheResult;
import co.com.google.search.tasks.OpenTheBrowser;
import co.com.google.search.userinterfaces.GoogleHomePage;
import co.com.google.search.tasks.SearchWord;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.*;

public class GoogleSearchStepDefinitions {
	
	//Inicializamos el Driver
	@Managed(driver = "Chrome")
	WebDriver hisDriver;
	
	//Definimos el actor para el método
	private Actor antonio = Actor.named("Antonio");
	
	private GoogleHomePage googleHomePage;
	
	//Método para asociar el actor al webDriver, es decir el actor manejará el webDriver
	
	//Abrimos el navegador con el actor definido
	@Before
	public void setup() {
		antonio.can(BrowseTheWeb.with(hisDriver));
	}
	
	//Abrimos la pagina de google	
	@Given("^that Antonio open google browser$")
	public void thatAntonioOpenGoogleBrowser() {
		antonio.wasAbleTo(OpenTheBrowser.at(googleHomePage));    
	}


	//Realizamos la búsqueda 
	@When("^he search (.*)")
	public void heSearchNorwayNorthenLights(String expectedWord) {
		antonio.attemptsTo(SearchWord.the());
		//antonio.should(seeThat(TheResult.is(),equalTo(expectedWord)));
	   
	}

	//Validamos el termino de la búsqueda
	@Then("^he should see the results$")
	public void heShouldSeeTheResults() {
		antonio.should(seeThat(TheResult.is(),equalTo("")));
	}

}
