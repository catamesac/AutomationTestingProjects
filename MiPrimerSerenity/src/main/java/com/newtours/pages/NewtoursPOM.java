package com.newtours.pages;

//Importamos las librerias para usar el WebElement, el FindBy, PageObject y DefaultUrl
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com")

public class NewtoursPOM extends PageObject {
	
	//Mapeo los elementos de la pagina llamando a los web elementes que necesito
	//Encuentra el campo de usuario
	@FindBy(name="userName")
	WebElement txtusername;
	
	//Encuentra el campo de la contraseña
	@FindBy(name="password")
	WebElement txtpassword;
	
	//Encuentra el boton login
	@FindBy(name="login")
	WebElement btnlogin;

	//Metodo que me recibe y escribe el usuario y la contraseña
	public void inputData(String usuario, String password) {
		txtusername.sendKeys(usuario);
		txtpassword.sendKeys(password);
	}
	
	//Metodo para dar click después de ingresas los datos de usuario y contraseña
	public void sendData(String usuario, String password) {	
		btnlogin.click();		
	}
	

}
