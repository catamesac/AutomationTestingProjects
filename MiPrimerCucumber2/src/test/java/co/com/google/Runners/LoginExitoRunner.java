package co.com.google.Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*Clase runner para compilar la metodologia POM con Junit 
 * lo hace llamando al feature y usando de referencia las clases de stepdefinitions 
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin ={"pretty",
	"json:C:\\Users\\SBMEDADMIN\\eclipse-workspace\\MiPrimerCucumber2\\JSONExito/cucumber.json"},features="Features/login_exito.feature",
glue="co.com.google.StepsDefinitions",tags="@tag")

public class LoginExitoRunner {

}
