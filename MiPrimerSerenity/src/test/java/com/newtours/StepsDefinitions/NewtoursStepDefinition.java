/*
 * Clase de Step Definition utilizando el patr�n Page Object Model 
 */

package com.newtours.StepsDefinitions;

import com.newtours.pages.loginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NewtoursStepDefinition {
	//declaramos login de tipo clase loginSteps
	@Steps
	loginSteps login;
	
	//Abrimos la pagina 
	@Given("^The new tours page$")
	public void the_new_tours_page() {
	login.openUrl();
	}
	 
	//Escribimos el usuario y la contrase�a
	@When("^I fill the user and password field$")
	public void i_fill_the_user_and_password_field() {
		login.inputData();
	}
	
	//Damos click en el bot�n login
	@When("^Click the submit button$")
	public void click_the_submit_button() {
		login.sendData();
	
	}
	
	//Si se logra hacer login se imprimer el mensaje de login existoso
	@Then("^I access to a new page$")
	public void i_access_to_a_new_page() {
		
		System.out.println("-------Logre logear-------");
	  
	}

}
