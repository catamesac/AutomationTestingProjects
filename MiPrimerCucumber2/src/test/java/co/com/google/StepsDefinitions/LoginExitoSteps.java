package co.com.google.StepsDefinitions;

import co.com.google.pages.LoginExitoPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class LoginExitoSteps {
	
	//definimos un controlador de tipo LoginexitoPom que contiene el controlador y todas sus tareas
	LoginExitoPOM exitoDriver = new LoginExitoPOM();
	
	//Definimos el navegador que vamos a utilizar y abrimos la pagina de logeo
	@Given("user navigate to exito")
	public void user_navigate_to_exito() {
	    exitoDriver.BuscarPaginaExito();
	    exitoDriver.OpenBrowser( "https://www.exito.com/account/registerLogin");
	 
	}
	 
	//Escribimos el usuario y la contraseña
	@When("I enter username as {string} and password as {string}")
	public void i_enter_username_as_and_password_as(String userBox, String passwordBox) {
	   userBox= "carlos9827@yahoo.com";
       passwordBox = "loginEXITO2018";
		exitoDriver.TypeTest(userBox, passwordBox);
		exitoDriver.ClickButton("btnLogin");
		//Imprimo los parametros que se enviaron para validar si el escenario outline definido en el feature funciona
		System.out.println(userBox + passwordBox);
		//Validamos que el campo de busqueda es igual al termino que se quiere buscar
		assertThat("El usuario es el mismo", userBox ,is("carlos9827@yahoo.com"));
	
	}
	
	//Validamos si el login fue exitoso 
	@Then("Login should be unsuccess")
	public void login_should_be_unsuccess() {
		 exitoDriver.ValidationLogin();
			exitoDriver.CloseBrowser();
	
	}

}
