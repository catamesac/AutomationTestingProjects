package co.com.cinemark.certificacion.compra.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/ComprarTicketCinemark.feature",
		glue = "co.com.cinemark.certificacion.compra.stepsdefinitions",
		snippets=SnippetType.CAMELCASE
)

public class CinemarkRunner {

}
