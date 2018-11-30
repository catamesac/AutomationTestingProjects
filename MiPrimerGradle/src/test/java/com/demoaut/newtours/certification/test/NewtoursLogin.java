//paquete de paginas
package com.demoaut.newtours.certification.test;

//Sirve para hacer las validaciones 
//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;;

public class NewtoursLogin {

	WebDriver Daniel;

	@Before //etiquetas, tags sirven para 
	public void setUp() throws Exception {
		
		//El controlador se encuentra en la direccione especifica
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); //
		
		//Crear el robot que nombro Daniel
		Daniel = new ChromeDriver();
			
		//Especifico la direccion que quiero trabajar
		Daniel.get("http://www.google.com");
	}

	@Test
	public void test() {
		//que google me bsuque la cajita de texto
		Daniel.findElement(By.name("q")).sendKeys("ultimo sismo");
		//Daniel.findElement(By.id("1st-ib")).sendKeys("Ultimo sismo");encuentra por id 
		
		//Le digo al robot que me encuentre el boton de buscar y le de click
		Daniel.findElement(By.name("btnK")).click();
	
	}
	
	@After
	public void tearDown() throws Exception {		
		Daniel.close();	
	}
}
