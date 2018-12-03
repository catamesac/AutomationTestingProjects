package com.exito.certification.runners;
//Clase que ejecuta el feature de buy_product
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions (plugin ={"pretty","html:C:\\Users\\SBMEDADMIN\\eclipse-workspace\\ExitoFinalProject\\Reports\\Buy\\HTML"},//Genera el reporte en html
					features="src/test/resources/features/buy_product.feature", //me ejecuta el feature en la ruta dada
					glue = "com.exito.certification.stepdefinitions", //busca en esta ruta los stepsdefinitions
					snippets = SnippetType.CAMELCASE //Me genera el nombre de los métodos con notación camelcase
)
public class BuyProductRunner {

}
