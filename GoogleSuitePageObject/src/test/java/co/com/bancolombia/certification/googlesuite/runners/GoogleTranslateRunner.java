package co.com.bancolombia.certification.googlesuite.runners;

/*
 * Clase que me genera los métodos a tráves del feature y que me ejecuta el patrón 
 * screenplay, además utiliza el CAMELCASE para implementas el nombre los métodos con esta regla
 */
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

	@RunWith(CucumberWithSerenity.class)
	@CucumberOptions(features="src/test/resources/features/google_translate.feature",
	glue = "co.com.bancolombia.certification.googlesuite.stepdefinitions",
	snippets = SnippetType.CAMELCASE
)

public class GoogleTranslateRunner {

}
