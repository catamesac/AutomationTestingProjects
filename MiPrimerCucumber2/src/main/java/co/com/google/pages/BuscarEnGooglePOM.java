
//los paquetes de la pagina por defecto
package co.com.google.pages;
//Importo las librerias de selenium para el controlador de  internet explorer 
import org.openqa.selenium.ie.InternetExplorerDriver;
//Importo las librerias de selenium para webdriver 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Importo las librerias de selenium para buscar por un  
import org.openqa.selenium.By;



//POM patron de diseno que permite organizar tu código 


public class BuscarEnGooglePOM {
	//Declaro mi robot (WebDriver) y lo nombro Antonio
	WebDriver Antonio;

	
	//Método para abrie el navegador
	public void BuscarEnGooglePOM() {
		//le digo que quiero encontrar el controlador de internet explorer en el primer parámetro, en el segundo parámetro le doy la dirección donde se encuentra
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
    
    //Metodo que me encuentra la casilla buscar , recibe por parametro el nombre del botón y le da click
      public void ClickButton(String buttonName) {
    	Antonio.findElement(By.name(buttonName)).click();
    }
  
    //Metodo que me saca del navegador
  	 public void CloseBrowser(){
  		Antonio.close();
  	}
  	
  	//Para capturar el texto de un elemento mostrado en pantalla
 	public String GetElement(String element) {
		WebElement id= Antonio.findElement(By.xpath(element));  
		return id.getText();

 	}
}

