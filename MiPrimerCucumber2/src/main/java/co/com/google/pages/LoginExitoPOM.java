package co.com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginExitoPOM {
	//Declaro mi robot (WebDriver) y lo nombro Antonio
	WebDriver Antonio;
	
	//M�todo para abrir el navegador
	public void BuscarPaginaExito() {
		//le digo que quiero encontrar el controlador de internet explorer en el primer par�metro, en el segundo par�metro le doy la direcci�n donde se encuentra
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe"); 
				
		// Creo una nueva instancia de mi robot para controlar internet explorer
		Antonio = new InternetExplorerDriver();
	}
	
	//M�todo que me abre la p�gina que quiero verificar
    public void OpenBrowser(String pagename) {
    	Antonio.get(pagename);
    }
    
    //M�todo para ingresar el usuario, el password 
    public void TypeTest(String userBox, String passwordBox) {
    	Antonio.findElement(By.id("userName")).sendKeys(userBox);
    	Antonio.findElement(By.id("password")).sendKeys(passwordBox);
    }
    
    //M�todo que me encuentra el icono de login por el nombre
    public void FindLoginIcon(String iconName) {
    	Antonio.findElement(By.name(iconName));
    }
    
    //M�todo que me encuentra la casilla buscar , recibe por parametro el nombre del bot�n y le da click
      public void ClickButton(String buttonName) {
    	Antonio.findElement(By.id(buttonName)).click();
    }
  
    //M�todo que me saca del navegador
  	 public void CloseBrowser(){
  		Antonio.close();
  	}
  	 
  	 //M�todo que me valida si el login fue exitoso
  	 public void ValidationLogin() {
  		 if(Antonio.getCurrentUrl().equalsIgnoreCase( "https://www.exito.com/account/registerLogin")){
  			         System.out.println("------Login Sucessfull----------"); 
  			      } else { 
  			         System.out.println("******Login Failed*******"); 
  			      }
  	 }
  	
 	public String GetElement(String element) {
 		//Para capturar el texto de un elemento mostrado en pantalla
		WebElement id= Antonio.findElement(By.xpath(element));  
		return id.getText();

 	}

}
