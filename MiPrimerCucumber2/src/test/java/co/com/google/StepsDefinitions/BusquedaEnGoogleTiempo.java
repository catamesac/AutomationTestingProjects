package co.com.google.StepsDefinitions;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import co.com.google.pages.BuscarEnGooglePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BusquedaEnGoogleTiempo {
	//definimos un controlador de tipo BuscarEnGooglePom que contiene el controlador y todas sus tareas
	BuscarEnGooglePOM Controlador = new BuscarEnGooglePOM();
	
	//Definimos el navegador que vamos a utilizar
	@Given("Que lanze el navegador de goole")
	public void que_lanze_el_navegador_de_goole() {
		Controlador.BuscarEnGooglePOM();
	}
	
	//Abrimos la pagina donde vamos a buscar
	@When("Abro la pagina de inicio de google")
	public void abro_la_pagina_de_inicio_de_google() {
		Controlador.OpenBrowser("https://www.google.com/");
	}
	
	//Ingreso el termino que quiero buscar y valido con hamcrest
	@Then("busco {string}")
	public void busco(String textoBusqueda) {
		textoBusqueda = "Tiempo en miami hoy";
		Controlador.TypeTest("q", textoBusqueda);
		Controlador.ClickButton("btnK");
		//Validamos que el campo de busqueda es igual al termino que se quiere buscar
		assertThat("El campo de busqueda es igual",textoBusqueda ,is("Tiempo en miami hoy"));
	}

}
