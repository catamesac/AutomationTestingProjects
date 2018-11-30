package com.demoaut.newtours.certification.pages;
//Librerias para usar las etiquetas Before, test y after
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
//Librerias para usar el control de error en hamscrest (asserThat)
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class NewToursLoginMain2 {
	
	//Declaro la clase que hereda los metodos 
	 NewtoursLoginPOM testInstaciasIe ;
	 
	 //Implemento POM definiendo los parametros primero 
		String pagename = "https://www.facebook.com";
		String apellido = "Mesa";
		String nombre = "Catalina";
		String buttonName= "websubmit";
		String imageCapture1 = "facebook";


	//etiquetas,tag sirven para 
	 @Before //Indica que se ejecutara antes de cada método, se ejecuta un before por cada test que se tenga pero se declara una vez
		public void setUp() throws Exception {
		 
		 //Decalro una nueva instancia de la clase Newtourspom
		 testInstaciasIe = new NewtoursLoginPOM();
		 //Abro el navegador
		 testInstaciasIe.OpenBrowser(pagename);			
		}
		
		@Test //Indica que es un método a testear
		public void test() {
			//Declaro los valores a ingresar
			String apellido = "Mesa";
			String nombre = "Catalina";
			
			//WebDriver ingresa los valores 
			testInstaciasIe.TypeTest("firstname", nombre);
			testInstaciasIe.TypeTest("lastname", apellido);
			testInstaciasIe.ClickButton("websubmit");
			
			//Invoco el método para tomar un pantallzo
			testInstaciasIe.takeScreenShotTest(imageCapture1);
			
			//valida que el campo de busqueda nombre sea el mismo que se declaro y el que se puso utilizando hamcrest
		    assertThat("El campo de busqueda es igual",nombre,is(nombre));

		}

		@After //indica que se ejecutara después de cada método, se ejecuta un after por cada test que se tenga
		public void tearDown() throws Exception {
			
			testInstaciasIe.CloseBrowser();
			
		}

}