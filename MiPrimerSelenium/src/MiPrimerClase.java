/*Mi primer Selenium
 * Utilizando Google Chrome
 * Autora: Catalina Mesa
 */
//Importar las librerias para Chrome
import org.openqa.selenium.chrome.ChromeDriver; 
//Importar la libreria para utilizar el WebDriver
import org.openqa.selenium.WebDriver; 
//Importar la libreria para que el WebDriver localice algún objeto por id, nombre, xpath,etc.
import org.openqa.selenium.By; 

public class MiPrimerClase {

	public static void main(String[] args) {

		//Dirigir el sistema al controlador de google chrome y le damos la ubicacion en el sistema en el segundo parametro
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); //
		
		//Crear el robot que nombro Daniel
		WebDriver Daniel = new ChromeDriver(); //el robot que abre el navergador lo delcaro, crea una variable del sistema

		//Especifico la direccion que quiero trabajar
		Daniel.get("http://www.google.com");
		
		//Le digo al WebDriver que google me busque la cajita de texto
		Daniel.findElement(By.name("q")).sendKeys("Suso");
		
		//Daniel sale del explorador
		Daniel.close();
		

	}

}
