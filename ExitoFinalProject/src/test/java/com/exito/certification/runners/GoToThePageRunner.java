package com.exito.certification.runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (plugin ={"pretty","html:C:\\Users\\SBMEDADMIN\\eclipse-workspace\\ExitoFinalProject\\Reports\\Login\\HTML"},
					features="src/test/resources/features/go_to_the_page.feature",
					glue = "com.exito.certification.stepdefinitions",
					snippets = SnippetType.CAMELCASE,
					tags = "@login")
public class GoToThePageRunner {
	

}
