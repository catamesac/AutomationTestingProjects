package co.com.google.search.runners;
/*
 * Clase que me compila a través del feature y los steps definitions
 */
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (plugin ={"pretty","html:C:\\Users\\SBMEDADMIN\\eclipse-workspace\\GoogleSearchScreenplay"},
					features="src/test/resources/features/google_search.feature",
					glue = "co.com.google.search.stepdefinitions",
					snippets = SnippetType.CAMELCASE
)

public class GoogleSearchRunner {
	

}
