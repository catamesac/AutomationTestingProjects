package com.newtours.pages;

import net.thucydides.core.annotations.Step;

public class loginSteps {
	
	//Aqui van las declaraciones de las variables
	NewtoursPOM pom = new NewtoursPOM();
	String usuario = "oli";
	String password="kase";
	
	//Método para abrir la url que hereda pom de la clase NewtoursPOM
	@Step
	public void openUrl() {
		pom.open();	
	}
	
	//Método que me escribe los datos del usuario y la contraseña definidos en la clase NewtoursPom
	@Step("escibiendo datos")
	public void inputData() {
		pom.inputData(usuario,password);
	}
	
	//Método que me envia los datos ingresados 
	@Step("Enviando datos")
	public void sendData() {
		pom.sendData(usuario,password);
	}
	
}
