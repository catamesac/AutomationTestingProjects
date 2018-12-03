package com.exito.certification.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (plugin ={"pretty","html:C:\\Users\\SBMEDADMIN\\eclipse-workspace\\ExitoFinalProject\\Reports\\Buy\\HTML"},
					features="src/test/resources/features/buy_product.feature",
					glue = "com.exito.certification.stepdefinitions",
					snippets = SnippetType.CAMELCASE
)
public class BuyProductRunner {

}
