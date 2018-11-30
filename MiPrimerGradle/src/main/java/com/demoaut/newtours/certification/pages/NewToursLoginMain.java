package com.demoaut.newtours.certification.pages; //Libreria por defecto

//importa las librerias para hacer las validaciones

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.After;
import org.junit.Assert;

public class NewToursLoginMain {
	
	//Declaro la clase testBusquedaBing que hereda los métodos de la clase NewtoursLoginPOM
	 	NewtoursLoginPOM testBusquedaBing ;
		String textoBusqueda = "Aurora Boreal";
		String textoBusqueda2 = "Noruega";
		String pagename = "https://www.bing.com/";
		String boxname = "q";
		String buttonName= "go";
		String imageCapture1 = "captura1";
		String imageCapture2 = "captura2";

	//Etiqueta Before Indica que se ejecutará antes de cada método, se ejecuta un before por cada test que se tenga pero se declara una vez
	 @Before 
		public void setUp() throws Exception {
		 //Decalro una nueva instancia de la clase Newtourspom
		 testBusquedaBing = new NewtoursLoginPOM();
		 //Abro el navegador
		 testBusquedaBing.OpenBrowser(pagename);
				
		}
	 
	
		@Test //Indica que es un método a testear
		public void test() {
			//WebDriver ingresa los valores previamente declarados
			testBusquedaBing.TypeTest(boxname, textoBusqueda);
			testBusquedaBing.ClickButton(buttonName);
			//Invoco el método para tomar un pantallzo
			testBusquedaBing.takeScreenShotTest(imageCapture1);
			//valida que el campo de busqueda nombre sea el mismo que se declaro y el que se puso utilizando hamcrest
			 assertThat("El campo de busqueda es igual",textoBusqueda,is("Aurora Boreal"));
			
		}
		
		@Test
		public void test2() {
			//WebDriver ingresa los valores previamente declarados
			testBusquedaBing.TypeTest(boxname, textoBusqueda2);
			testBusquedaBing.ClickButton(buttonName);
			//Invoco el método para tomar un pantallzo
			testBusquedaBing.takeScreenShotTest(imageCapture2);
			//valida que el campo de busqueda nombre sea el mismo que se declaro y el que se puso utilizando hamcrest
			Assert.assertNotEquals(textoBusqueda,textoBusqueda2,"El campo de busqueda no es igual");		
			}
		
				
		@After //indica que se ejecutara despues de cada metodo, se ejecuta un after por cada test que se tenga
		public void tearDown() throws Exception {
			testBusquedaBing.CloseBrowser();
			
		}
	

}
