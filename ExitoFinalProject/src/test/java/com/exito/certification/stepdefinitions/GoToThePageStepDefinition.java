package com.exito.certification.stepdefinitions;
/*
 * Clase para definir los StepDefinitios para ir a la pagina del Exito
 */
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;
import org.openqa.selenium.WebDriver;
import com.exito.certification.userinterfaces.ExitoHomePage;
import com.exito.certification.exceptions.FailLogin;
import com.exito.certification.models.LoginData;
import com.exito.certification.questions.ExitoLogin;
import com.exito.certification.tasks.FillTheFields;
import com.exito.certification.tasks.GoToLogin;
import com.exito.certification.tasks.OpenTheBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoToThePageStepDefinition {
	
	//Inicializamos el Driver
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	//Definimos el actor para el método
	private Actor antonio = Actor.named("Antonio");
	//Definimos la página objeto
	private ExitoHomePage exitoHomePage;
	
	@Before
	public void setUp() {
		antonio.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^that Antonio goes to the Exito home page$")
	public void thatAntonioGoesToTheExitoHomePage() {
	antonio.wasAbleTo(OpenTheBrowser.on(exitoHomePage));  
	}
	
	@Given("^he goes to login page$")
	public void heGoesToLoginPage() {
		antonio.attemptsTo((GoToLogin.inLoginPage()));
	}
		
	@When("^he put username and password$")
	public void hePutUsernameAndPassword(List<LoginData> loginDataFields) {
		antonio.attemptsTo(FillTheFields.inThe(loginDataFields));	    	  
	}
	
	@Then("^he should be logged in$")
	public void heShouldBeLoggedIn() {
	   antonio.should(seeThat(ExitoLogin.isSuccessful()).orComplainWith(FailLogin.class, FailLogin.getfailureLoginMessage()));	  
	}

}
