package co.com.bancolombia.certification.googlesuite.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import org.openqa.selenium.WebDriver;
import co.com.bancolombia.certification.googlesuite.tasks.GoTo;
import co.com.bancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.googlesuite.tasks.Translate;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleHomePage;
import co.com.bancolombia.certification.googlesuite.questions.TheResult;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	//Para inicializarlo, instaciarlo usamos el Managed
	@Managed(driver = "chrome")
	
	//Declaramos el WebDriver privado porque solo lo vamos  a usar en esta clase
	private WebDriver herBrowser; //se pone herbrowser porque es una mujer la declarada en el feature susan
	
	//Declamor el Actor que usara el WebDriver
	private Actor susan = Actor.named("Susan");
	
	//Crea variable de clase GoogleHomePage
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setUp() {
		//Susan puede navegar en la web con su navegador 
		susan.can(BrowseTheWeb.with(herBrowser));
	}
	
	//En el given van las precondiciones de la prueba: acciones que hay que hacer para llegar a la pagina donde se va a taducir
	@Given("^the susan wants to translate a word$")
	public void theSusanWantsToTranslateAWord() throws Exception {
		//1. abrir el navegador en www.google.com
		//Instanciamos la clase OpenTheBrowser para que el metodo la pueda reconocer: los metodos no reciben clases, solo objetos, instancias..	
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage),
			  GoTo.theApp(GoogleAppsComponent.GOOLE_TRANSLATE));//Fue capaz de, es precondicion, se usa en los given
		
		//2.Ir a google Traslate (Click google apps, click google traslate
		
	}
	 
	//En el metodo when van las condiciones: Traducir la palabra de ingles a Espanol
	@When("^she translate the word cheese from English to Spanish$")
	public void sheTranslateTheWordCheeseFromEnglishToSpanish() throws Exception {
		susan.wasAbleTo(Translate.the());
	   
	}
	
	//En el then van las postcondiciones o consecuencias: aparece la palabra traducida y se verifica(assert)
	@Then("^she should see the word (.*) in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen(String expectedWord) throws Exception {
		susan.should(seeThat(TheResult.is(),equalTo(expectedWord)));
		
}
}
