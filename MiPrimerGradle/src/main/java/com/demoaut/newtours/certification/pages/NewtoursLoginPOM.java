
//los paquetes de la pagina por defecto
package com.demoaut.newtours.certification.pages;

//Libreria para trabajar archivos
import java.io.File;
import org.openqa.selenium.OutputType;
import com.google.common.io.Files;
//Libreria de control de excepciones 
import java.io.IOException;
//Importo las librerias de selenium para buscar por un
import org.openqa.selenium.By;
//Libreria para poder tomar el creenshot
import org.openqa.selenium.TakesScreenshot;
//Importo las librerias de selenium para webdriver 
import org.openqa.selenium.WebDriver;
//Importo las librerias de selenium para el controlador de  internet explorer 
import org.openqa.selenium.ie.InternetExplorerDriver;

//POM patron de diseño que permite organizar tu código 

	public class NewtoursLoginPOM {
	//Declaro mi robot (WebDriver) y lo nombro Antonio
	WebDriver Antonio; 
	
	//Metodo que instancia la clase del robot
	public  NewtoursLoginPOM() {
		//le digo que quiero encontrar el controlador de internet explorer en el primer parametro, en el segundo parametro le doy la dirección donde se encuentra
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe"); 		
		// Creo una nueva instancia de mi robot para controlar internet explorer
		Antonio = new InternetExplorerDriver();
	}
	
	//Método que me abre la página que quiero verificar
    public void OpenBrowser(String pagename) {
    	Antonio.get(pagename);
    }
    
	 //Método que me encuentra la casilla para escribir lo que deseo buscar, recibe en el primer parámetro el nombre de la casilla para escribir y en el segundo lo que quiero escribir
    public void TypeTest(String boxname, String textBox) {
    	Antonio.findElement(By.name(boxname)).sendKeys(textBox);  	
    }
    
    //Método que me encuentra la casilla buscar , recibe por parametro el nombre del botón y le da click
      public void ClickButton(String buttonName) {
    	Antonio.findElement(By.name(buttonName)).click();
    }
  
    //Método que me saca del navegador
  	 public void CloseBrowser(){
  		Antonio.close();
  	}
  	 
	 public void takeScreenShotTest(String imageCapture) {
  		 //Directorio donde se guardaran las imagenes
  		 File directory = new File("C:\\Users\\SBMEDADMIN\\eclipse-workspace\\MiPrimerGradle\\Screenshot");
  		 
  		 try {
  			 if (directory.isDirectory()) {
  				 //toma el screenshot
  				 File imagen = ((TakesScreenshot) Antonio).getScreenshotAs(OutputType.FILE);
  				 //Se guardan los screenshot 
  				 Files.copy(imagen,new File(directory.getAbsolutePath() + "\\" + imageCapture + ".png"));
  				 System.out.println("Screenshot taken");
  			 }
  			 else {
  				 //Mensaje de error si no encuentra donde almacenar la foto
  				 throw new IOException("ERROR; la ruta especificada no es un directorio");
  			 }
  		 }
  		 
  		 catch(IOException e) {
  			 e.printStackTrace();
  		 }
	 }

    
}

